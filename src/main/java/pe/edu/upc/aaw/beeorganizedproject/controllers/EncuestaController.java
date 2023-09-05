package pe.edu.upc.aaw.beeorganizedproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.beeorganizedproject.dtos.EncuestaDTO;
import pe.edu.upc.aaw.beeorganizedproject.entities.Encuesta;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IEncuestaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/encuesta")
public class EncuestaController {
    @Autowired
    private IEncuestaService eS;

    @PostMapping
    public void registrar(@RequestBody EncuestaDTO dto) {
        ModelMapper m = new ModelMapper();
        Encuesta e = m.map(dto, Encuesta.class);
        eS.insert(e);
    }

    @GetMapping
    public List<EncuestaDTO> listar() {
        return eS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,EncuestaDTO.class);
        }).collect(Collectors.toList());
    }
}
