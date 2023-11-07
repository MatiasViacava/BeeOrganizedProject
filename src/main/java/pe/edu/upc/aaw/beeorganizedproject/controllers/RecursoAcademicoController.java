package pe.edu.upc.aaw.beeorganizedproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.beeorganizedproject.dtos.RecursoAcademicoDTO;
import pe.edu.upc.aaw.beeorganizedproject.entities.RecursoAcademico;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IRecursoAcademicoService;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/recursosacademicos")
public class RecursoAcademicoController {
    @Autowired
    private IRecursoAcademicoService iraS;

    @PostMapping
    public void registrar(@RequestBody RecursoAcademicoDTO dto){
        ModelMapper m=new ModelMapper();
        RecursoAcademico ra=m.map(dto,RecursoAcademico.class);
        iraS.insert(ra);
    }

    @GetMapping
    public List<RecursoAcademicoDTO> listar(){
        return iraS.List().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, RecursoAcademicoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer iD){
        iraS.delete(iD);
    }

    @PutMapping
    public void modificar(@RequestBody RecursoAcademicoDTO dto){
        ModelMapper m=new ModelMapper();
        RecursoAcademico ra=m.map(dto,RecursoAcademico.class);
        iraS.insert(ra);
    }

    @GetMapping("/{id}")
    public RecursoAcademicoDTO listarId(@PathVariable("id") int  id) {
        ModelMapper m=new ModelMapper();
        RecursoAcademicoDTO dto=m.map(iraS.listarId(id),RecursoAcademicoDTO.class);
        return dto;
    }

    @PostMapping("/buscar")
    public List<RecursoAcademicoDTO> buscar(@RequestBody Map<String, String> request) {
        String fechaStr = request.get("fecha");
        LocalDate fecha = LocalDate.parse(fechaStr);
        return iraS.findByFechaPublicacion(fecha).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,RecursoAcademicoDTO.class);
        }).collect(Collectors.toList());
    }
}
