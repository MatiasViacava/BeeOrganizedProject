package pe.edu.upc.aaw.beeorganizedproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.beeorganizedproject.dtos.TipoActividadDTO;
import pe.edu.upc.aaw.beeorganizedproject.dtos.TipoRecursoDTO;
import pe.edu.upc.aaw.beeorganizedproject.entities.TipoRecurso;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.ITipoRecursoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/TipoRecurso")
public class TipoRecursoController {
    @Autowired
    private ITipoRecursoService trS;
    @PostMapping
    public void registrar(@RequestBody TipoActividadDTO dto){
        ModelMapper m= new ModelMapper();
        TipoRecurso r= m.map(dto,TipoRecurso.class);
        trS.insert(r);
    }
    @GetMapping
    public List<TipoRecursoDTO> listar(){
        return trS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, TipoRecursoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        trS.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody TipoActividadDTO dto){
        ModelMapper m= new ModelMapper();
        TipoRecurso r= m.map(dto,TipoRecurso.class);
        trS.insert(r);
    }
}
