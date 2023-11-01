package pe.edu.upc.aaw.beeorganizedproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.beeorganizedproject.dtos.IdiomaDTO;
import pe.edu.upc.aaw.beeorganizedproject.entities.Idioma;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IIdiomaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/idiomas")
public class IdiomaController {
    @Autowired
    private IIdiomaService iS;
    @PostMapping
    public void registrar(@RequestBody IdiomaDTO dto){
        ModelMapper m=new ModelMapper();
        Idioma i=m.map(dto,Idioma.class);
        iS.insert(i);
    }

    @GetMapping
    public List<IdiomaDTO> listar(){
        return iS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,IdiomaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){iS.delete(id);}

    @PutMapping
    public void modificar(@RequestBody IdiomaDTO dto){
        ModelMapper m=new ModelMapper();
        Idioma i=m.map(dto,Idioma.class);
        iS.insert(i);

    }

    @GetMapping("/{id}")
    public IdiomaDTO listarId(@PathVariable("id") int  id) {
        ModelMapper m=new ModelMapper();
        IdiomaDTO dto=m.map(iS.listarId(id),IdiomaDTO.class);
        return dto;
    }

}
