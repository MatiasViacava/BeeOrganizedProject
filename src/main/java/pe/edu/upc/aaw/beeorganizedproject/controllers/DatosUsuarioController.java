package pe.edu.upc.aaw.beeorganizedproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.beeorganizedproject.dtos.DatosUsuarioDTO;
import pe.edu.upc.aaw.beeorganizedproject.entities.DatosUsuario;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IDatosUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class DatosUsuarioController {
    @Autowired
    private IDatosUsuarioService uR;
    @PostMapping
    public void registrar(@RequestBody DatosUsuarioDTO dto){
        ModelMapper m = new ModelMapper();
        DatosUsuario i = m.map(dto, DatosUsuario.class);
        uR.insert(i);
    }
    @GetMapping
    public List<DatosUsuarioDTO> listar(){
        return uR.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, DatosUsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        uR.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody DatosUsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        DatosUsuario d=m.map(dto, DatosUsuario.class);
        uR.insert(d);
    }
}
