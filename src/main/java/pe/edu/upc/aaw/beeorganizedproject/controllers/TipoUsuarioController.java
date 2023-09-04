package pe.edu.upc.aaw.beeorganizedproject.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.beeorganizedproject.dtos.TipoUsuarioDTO;
import pe.edu.upc.aaw.beeorganizedproject.entities.TipoUsuario;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.ITipoUsuarioService;
import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/tipousuario")
public class TipoUsuarioController {
    @Autowired
    private ITipoUsuarioService tR;
    @PostMapping
    public void registrar(@RequestBody TipoUsuarioDTO dto){
        ModelMapper m = new ModelMapper();
        TipoUsuario d = m.map(dto, TipoUsuario.class);
        tR.insert(d);
    }
    @GetMapping
    public List<TipoUsuarioDTO> listar(){
        return tR.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, TipoUsuarioDTO.class);
        }).collect(Collectors.toList());
    }
}
