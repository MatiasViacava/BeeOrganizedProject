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
@RequestMapping("/encuestas")
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
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){eS.delete(id);}

    @PutMapping
    public void modificar(@RequestBody EncuestaDTO dto){
        ModelMapper m=new ModelMapper();
        Encuesta e=m.map(dto,Encuesta.class);
        eS.insert(e);
    }

    @GetMapping("/{id}")
    public EncuestaDTO listarId(@PathVariable("id") int  id) {
        ModelMapper m=new ModelMapper();
        EncuestaDTO dto=m.map(eS.listarId(id),EncuestaDTO.class);
        return dto;
    }

    @GetMapping("/ultimaencuestacreada")
    public int ultimaEncuestaCreada()
    {
        return eS.ultimaEncuestacreada();
    }
}
