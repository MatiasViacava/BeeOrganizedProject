package pe.edu.upc.aaw.beeorganizedproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.beeorganizedproject.dtos.UsuarioDTO;
import pe.edu.upc.aaw.beeorganizedproject.entities.Usuario;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService uR;
    @PostMapping
    public void registrar(@RequestBody UsuarioDTO dto){
        ModelMapper m = new ModelMapper();
        Usuario i = m.map(dto, Usuario.class);
        uR.insert(i);
    }
    @GetMapping
    public List<UsuarioDTO> listar(){
        return uR.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

}
