package pe.edu.upc.aaw.beeorganizedproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.beeorganizedproject.dtos.EncuestaDTO;
import pe.edu.upc.aaw.beeorganizedproject.dtos.IdiomaDTO;
import pe.edu.upc.aaw.beeorganizedproject.entities.Encuesta;
import pe.edu.upc.aaw.beeorganizedproject.entities.Idioma;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IEncuestaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/encuestas")
public class EncuestaController {
    @Autowired
    private IEncuestaService eS;
    @PostMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('PROGRAMADOR')")
    public void registrar(@RequestBody EncuestaDTO dto) {
        ModelMapper m = new ModelMapper();
        Encuesta e = m.map(dto, Encuesta.class);
        eS.insert(e);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ESTUDIANTE') or hasAuthority('ADMINISTRADOR') or hasAuthority('PROGRAMADOR')")
    public List<EncuestaDTO> listar() {
        return eS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,EncuestaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('PROGRAMADOR')")
    public void eliminar(@PathVariable("id")Integer id){eS.delete(id);}

    @PutMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('PROGRAMADOR')")
    public void modificar(@RequestBody EncuestaDTO dto){
        ModelMapper m=new ModelMapper();
        Encuesta e=m.map(dto,Encuesta.class);
        eS.insert(e);
    }
}
