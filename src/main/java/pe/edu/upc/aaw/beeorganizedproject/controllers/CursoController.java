package pe.edu.upc.aaw.beeorganizedproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.beeorganizedproject.dtos.CursoDTO;
import pe.edu.upc.aaw.beeorganizedproject.dtos.HorarioDTO;
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

    @GetMapping("/{id}")
    public CursoDTO listarId(@PathVariable("id") int  id) {
        ModelMapper m=new ModelMapper();
        CursoDTO dto=m.map(dC.listarId(id),CursoDTO.class);
        return dto;
    }

    @GetMapping("/listar/{id2}")
    public List<CursoDTO> listarporidusuario(@PathVariable("id2") long id){
        return dC.buscarPorIdUsuario(id).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, CursoDTO.class);
        }).collect(Collectors.toList());
    }
}
