package pe.edu.upc.aaw.beeorganizedproject.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.beeorganizedproject.dtos.TiposUsuarioDTO;
import pe.edu.upc.aaw.beeorganizedproject.entities.TiposUsuario;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.ITipoUsuarioService;
import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/tiposusuarios")
public class TiposUsuarioController {
    @Autowired
    private ITipoUsuarioService tR;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('PROGRAMADOR')")
    public void registrar(@RequestBody TiposUsuarioDTO dto){
        ModelMapper m = new ModelMapper();
        TiposUsuario d = m.map(dto, TiposUsuario.class);
        tR.insert(d);
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR','PROGRAMADOR')")
    public List<TiposUsuarioDTO> listar(){
        return tR.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, TiposUsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('PROGRAMADOR')")
    public void eliminar(@PathVariable("id")Integer id){
        tR.delete(id);
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('PROGRAMADOR')")
    public void modificar(@RequestBody TiposUsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        TiposUsuario d=m.map(dto, TiposUsuario.class);
        tR.insert(d);
    }
}
