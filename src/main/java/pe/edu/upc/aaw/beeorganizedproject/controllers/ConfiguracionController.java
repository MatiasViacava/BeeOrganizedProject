package pe.edu.upc.aaw.beeorganizedproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.beeorganizedproject.dtos.ActividadDTO;
import pe.edu.upc.aaw.beeorganizedproject.dtos.ConfiguracionDTO;
import pe.edu.upc.aaw.beeorganizedproject.entities.Configuracion;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IConfiguracionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/configuraciones")
public class ConfiguracionController {
    @Autowired
    private IConfiguracionService cS;

    @PostMapping
    @PreAuthorize("hasAuthority('ESTUDIANTE') or hasAuthority('ADMINISTRADOR') or hasAuthority('PROGRAMADOR')")
    public void registrar(@RequestBody ConfiguracionDTO dto){
        ModelMapper m = new ModelMapper();
        Configuracion d = m.map(dto, Configuracion.class);
        cS.insert(d);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ESTUDIANTE') or hasAuthority('ADMINISTRADOR') or hasAuthority('PROGRAMADOR')")
    public void eliminar(@PathVariable("id")Integer id){
        cS.delete(id);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('PROGRAMADOR')")
    public List<ConfiguracionDTO> listar(){
        return cS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ConfiguracionDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('PROGRAMADOR')")
    public ConfiguracionDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        ConfiguracionDTO d = m.map(cS.listId(id), ConfiguracionDTO.class);
        return d;
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ESTUDIANTE') or hasAuthority('ADMINISTRADOR') or hasAuthority('PROGRAMADOR')")
    public void modificar(@RequestBody ConfiguracionDTO dto){
        ModelMapper m = new ModelMapper();
        Configuracion d = m.map(dto, Configuracion.class);
        cS.insert(d);
    }
}
