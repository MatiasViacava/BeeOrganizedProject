package pe.edu.upc.aaw.beeorganizedproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.beeorganizedproject.dtos.HorarioDTO;
import pe.edu.upc.aaw.beeorganizedproject.dtos.TipoActividadDTO;
import pe.edu.upc.aaw.beeorganizedproject.entities.Horario;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IHorarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/horarios")
public class HorarioController {
    @Autowired
    private IHorarioService hS;

    @PostMapping
    public void registrar(@RequestBody HorarioDTO dto){
        ModelMapper m=new ModelMapper();
        Horario d=m.map(dto,Horario.class);
        hS.insert(d);
    }

    @GetMapping
    public List<HorarioDTO> Listar(){
        return hS.List().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,HorarioDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        hS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody HorarioDTO dto){
        ModelMapper m=new ModelMapper();
        Horario d=m.map(dto,Horario.class);
        hS.insert(d);
    }

    @GetMapping("/{id}")
    public HorarioDTO listarId(@PathVariable("id") int idHorario) {
        ModelMapper m=new ModelMapper();
        HorarioDTO dto=m.map(hS.listarId(idHorario),HorarioDTO.class);
        return dto;
    }
}
