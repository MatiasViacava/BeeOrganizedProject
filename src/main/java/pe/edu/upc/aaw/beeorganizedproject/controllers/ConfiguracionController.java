package pe.edu.upc.aaw.beeorganizedproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.beeorganizedproject.dtos.ConfiguracionDTO;
import pe.edu.upc.aaw.beeorganizedproject.entities.Configuracion;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IConfiguracionService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/configuracions")
public class ConfiguracionController {
    @Autowired
    private IConfiguracionService cS;
    @PostMapping
    public void registrar(@RequestBody ConfiguracionDTO dto){
        ModelMapper m = new ModelMapper();
        Configuracion d = m.map(dto, Configuracion.class);
        cS.insert(d);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        cS.delete(id);
    }

    @GetMapping("/{id}")
    public ConfiguracionDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        ConfiguracionDTO d = m.map(cS.listId(id), ConfiguracionDTO.class);
        return d;
    }
    @PutMapping
    public void modificar(@RequestBody ConfiguracionDTO dto){
        ModelMapper m = new ModelMapper();
        Configuracion d = m.map(dto, Configuracion.class);
        cS.insert(d);
    }
}
