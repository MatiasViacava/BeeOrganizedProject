package pe.edu.upc.aaw.beeorganizedproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.beeorganizedproject.dtos.RecursoAcademicoDTO;
import pe.edu.upc.aaw.beeorganizedproject.entities.RecursoAcademico;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IRecursoAcademicoService;

import java.util.List;
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

    @DeleteMapping
    public void eliminar(@PathVariable("ID")Integer id){
        iraS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody RecursoAcademicoDTO dto){
        ModelMapper m=new ModelMapper();
        RecursoAcademico ra=m.map(dto,RecursoAcademico.class);
        iraS.insert(ra);
    }
}
