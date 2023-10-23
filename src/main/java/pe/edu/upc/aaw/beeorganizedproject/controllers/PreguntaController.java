package pe.edu.upc.aaw.beeorganizedproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.beeorganizedproject.dtos.PreguntaDTO;
import pe.edu.upc.aaw.beeorganizedproject.entities.Pregunta;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IPreguntaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/preguntas")
public class PreguntaController {
    @Autowired
    private IPreguntaService pS;
    @PostMapping
    public void registrar(@RequestBody PreguntaDTO dto) {
        ModelMapper m = new ModelMapper();
        Pregunta p = m.map(dto, Pregunta.class);
        pS.insert(p);
    }

    @GetMapping
    public List<PreguntaDTO> listar() {
        return pS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,PreguntaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){pS.delete(id);}

    @PutMapping
    public void modificar(@RequestBody PreguntaDTO dto){
        ModelMapper m=new ModelMapper();
        Pregunta p= m.map(dto,Pregunta.class);
        pS.insert(p);
    }
}
