package pe.edu.upc.aaw.beeorganizedproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.beeorganizedproject.dtos.ActividadDTO;
import pe.edu.upc.aaw.beeorganizedproject.dtos.HorarioDTO;
import pe.edu.upc.aaw.beeorganizedproject.entities.Actividad;
import pe.edu.upc.aaw.beeorganizedproject.entities.Horario;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IActividadService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping
public class ActividadController {
    @Autowired
    private IActividadService aS;
    @PostMapping
    public void registrar(@RequestBody ActividadDTO dto){
        ModelMapper m=new ModelMapper();
        Actividad d=m.map(dto,Actividad.class);
        aS.insert(d);
    }
    @GetMapping
    public List<ActividadDTO> Listar(){
        return aS.List().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ActividadDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        aS.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody ActividadDTO dto){
        ModelMapper m=new ModelMapper();
        Actividad d=m.map(dto,Actividad.class);
        aS.insert(d);
    }
}
