package pe.edu.upc.aaw.beeorganizedproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('PROGRAMADOR')")
    public void registrar(@RequestBody RecursoAcademicoDTO dto){
        ModelMapper m=new ModelMapper();
        RecursoAcademico ra=m.map(dto,RecursoAcademico.class);
        iraS.insert(ra);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ESTUDIANTE') or hasAuthority('ADMINISTRADOR') or hasAuthority('PROGRAMADOR')")
    public List<RecursoAcademicoDTO> listar(){
        return iraS.List().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, RecursoAcademicoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('PROGRAMADOR')")
    public void eliminar(@PathVariable("ID")Integer id){
        iraS.delete(id);
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('PROGRAMADOR')")
    public void modificar(@RequestBody RecursoAcademicoDTO dto){
        ModelMapper m=new ModelMapper();
        RecursoAcademico ra=m.map(dto,RecursoAcademico.class);
        iraS.insert(ra);
    }
}
