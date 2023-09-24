package pe.edu.upc.aaw.beeorganizedproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('PROGRAMADOR')")
    public void registrar(@RequestBody IdiomaDTO dto){
        ModelMapper m=new ModelMapper();
        Idioma i=m.map(dto,Idioma.class);
        iS.insert(i);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('PROGRAMADOR')")
    public List<IdiomaDTO> listar(){
        return iS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,IdiomaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('PROGRAMADOR')")
    public void eliminar(@PathVariable("id")Integer id){iS.delete(id);}

    @PutMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('PROGRAMADOR')")
    public void modificar(@RequestBody IdiomaDTO dto){
        ModelMapper m=new ModelMapper();
        Idioma i=m.map(dto,Idioma.class);
        iS.insert(i);

    }

}
