package pe.edu.upc.aaw.beeorganizedproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.beeorganizedproject.dtos.UsuarioDTO;
import pe.edu.upc.aaw.beeorganizedproject.entities.Usuarios;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IUsuarioService;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService uR;

    @PostMapping
    @PreAuthorize("hasAuthority('ESTUDIANTE') or hasAuthority('ADMINISTRADOR') or hasAuthority('PROGRAMADOR')")
    public void registrar(@RequestBody UsuarioDTO dto){
        ModelMapper m = new ModelMapper();
        Usuarios i = m.map(dto, Usuarios.class);
        uR.insert(i);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ESTUDIANTE') or hasAuthority('ADMINISTRADOR') or hasAuthority('PROGRAMADOR')")
    public List<UsuarioDTO> listar(){
        return uR.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ESTUDIANTE') or hasAuthority('ADMINISTRADOR') or hasAuthority('PROGRAMADOR')")
    public void eliminar(@PathVariable("id")Integer id){
        uR.delete(id);
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ESTUDIANTE') or hasAuthority('ADMINISTRADOR') or hasAuthority('PROGRAMADOR')")
    public void modificar(@RequestBody UsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        Usuarios d=m.map(dto, Usuarios.class);
        uR.insert(d);
    }
}
