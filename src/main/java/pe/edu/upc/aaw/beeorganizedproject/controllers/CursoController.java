package pe.edu.upc.aaw.beeorganizedproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.beeorganizedproject.dtos.CursoDTO;
import pe.edu.upc.aaw.beeorganizedproject.entities.Curso;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.ICursoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private ICursoService dC;
    @PostMapping
    public void registrar(@RequestBody CursoDTO dto){
        ModelMapper m=new ModelMapper();
        Curso c=m.map(dto,Curso.class);
        dC.insert(c);
    }
    @GetMapping
    public List<CursoDTO> listar(){
        return dC.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,CursoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        dC.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody CursoDTO dto){
        ModelMapper m=new ModelMapper();
        Curso c=m.map(dto,Curso.class);
        dC.insert(c);
    }
}
