package pe.edu.upc.aaw.beeorganizedproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.beeorganizedproject.dtos.TipoActividadDTO;
import pe.edu.upc.aaw.beeorganizedproject.entities.TipoActividad;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.ITipoActividadService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/TipoActividads")
public class TipoActividadController {
    @Autowired
    private ITipoActividadService taS;

    @PostMapping
    public void registrar(@RequestBody TipoActividadDTO dto){
        ModelMapper m=new ModelMapper();
        TipoActividad d=m.map(dto,TipoActividad.class);
        taS.insert(d);
    }
    @GetMapping
    public List<TipoActividadDTO> Listar(){
        return taS.List().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,TipoActividadDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        taS.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody TipoActividadDTO dto){
        ModelMapper m=new ModelMapper();
        TipoActividad d=m.map(dto,TipoActividad.class);
        taS.insert(d);
    }
}
