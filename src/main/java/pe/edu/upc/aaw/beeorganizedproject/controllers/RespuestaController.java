package pe.edu.upc.aaw.beeorganizedproject.controllers;

import net.bytebuddy.matcher.StringMatcher;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.beeorganizedproject.dtos.RespuestaDTO;
import pe.edu.upc.aaw.beeorganizedproject.entities.Respuesta;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IRespuestaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/respuesta")
public class RespuestaController {
    @Autowired
    private IRespuestaService rS;
    @PostMapping
    public void registrar(@RequestBody RespuestaDTO dto){
        ModelMapper m=new ModelMapper();
        Respuesta r=m.map(dto, Respuesta.class);
        rS.insert(r);
    }

    @GetMapping
    public List<RespuestaDTO> listar(){
        return rS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, RespuestaDTO.class);
        }).collect(Collectors.toList());
    }
}
