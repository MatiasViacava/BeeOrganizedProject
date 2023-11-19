package pe.edu.upc.aaw.beeorganizedproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.beeorganizedproject.dtos.HorarioDTO;
import pe.edu.upc.aaw.beeorganizedproject.dtos.UsuarioDTO;
import pe.edu.upc.aaw.beeorganizedproject.entities.Usuarios;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IUsuarioService;


import java.time.LocalDate;
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
        Usuarios i = m.map(dto, Usuarios.class);
        uR.insert(i);
    }

    @GetMapping
    public List<UsuarioDTO> listar(){
        return uR.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        uR.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody UsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        Usuarios d=m.map(dto, Usuarios.class);
        uR.insert(d);
    }
    @GetMapping("/{id}")
    public UsuarioDTO listarId(@PathVariable("id") Long  id) {
        ModelMapper m=new ModelMapper();
        UsuarioDTO dto=m.map(uR.listarId(id),UsuarioDTO.class);
        return dto;
    }

    //BUSCAR POR NOMBRE
    @PostMapping("/buscarnombre")
    public List<UsuarioDTO> buscarNombre(@RequestBody String name) {
        return uR.findByNombres(name).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/ultimousuariocreado")
    public int ultimoUsuarioCreado()
    {
        return uR.ultimoUsuarioCreado();
    }

    @GetMapping("/actualizar/{id2}/{p1}/{p2}/{p3}/{p4}/{p5}/{p6}/{p7}/{p8}")
    public void actualizardatos(@PathVariable("id2") Long id2, @PathVariable("p1") String p1,
    @PathVariable("p2") String p2, @PathVariable("p3") String p3, @PathVariable("p4") String p4,
    @PathVariable("p5") String p5, @PathVariable("p6") String p6, @PathVariable("p7") String p7,
    @PathVariable("p8") String p8)
    {
        uR.actualizarUsuario(id2,p1,p2,Boolean.parseBoolean(p3),p4,p5,LocalDate.parse(p6),p7,p8);
    }

    @GetMapping("/listar/{id2}")
    public List<UsuarioDTO> listarporid(@PathVariable("id2") long id){
        return uR.findById(id).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

}
