package pe.edu.upc.aaw.beeorganizedproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.beeorganizedproject.dtos.RespuestaDTO;
import pe.edu.upc.aaw.beeorganizedproject.entities.Respuesta;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IRespuestaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/respuestas")
public class RespuestaController {
    @Autowired
    private IRespuestaService rS;
    @PostMapping
    @PreAuthorize("hasAuthority('ESTUDIANTE') or hasAuthority('ADMINISTRADOR')")
    public void registrar(@RequestBody RespuestaDTO dto) {
        ModelMapper m = new ModelMapper();
        Respuesta r = m.map(dto, Respuesta.class);
        rS.insert(r);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('PROGRAMADOR')")
    public List<RespuestaDTO> listar() {
        return rS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RespuestaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('PROGRAMADOR')")
    public void eliminar(@PathVariable("id")Integer id){rS.delete(id);}

    @PutMapping
    @PreAuthorize("hasAuthority('ESTUDIANTE') or hasAuthority('ADMINISTRADOR') or hasAuthority('PROGRAMADOR')")
    public void modificar(@RequestBody RespuestaDTO dto){
        ModelMapper m=new ModelMapper();
        Respuesta r= m.map(dto,Respuesta.class);
        rS.insert(r);
    }
}
