package pe.edu.upc.aaw.beeorganizedproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.beeorganizedproject.dtos.DatosUsuarioDTO;
import pe.edu.upc.aaw.beeorganizedproject.entities.DatosUsuario;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IUsuarioService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/datos_usuarios")
public class DatosUsuarioController {
    @Autowired
    private IUsuarioService uR;
    @PostMapping
    public void registrar(@RequestBody DatosUsuarioDTO dto){
        ModelMapper m = new ModelMapper();
        DatosUsuario i = m.map(dto, DatosUsuario.class);
        uR.insert(i);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<DatosUsuarioDTO> listar(){
        return uR.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, DatosUsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/listar_admins")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<DatosUsuarioDTO> listar_admins(){

        List<DatosUsuarioDTO> ListaTemp = new ArrayList<>();

        uR.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            if (x.getTipoUsuario().getNombreTipoUsuario().equals("STUDENT"))
            {ListaTemp.add(m.map(x, DatosUsuarioDTO.class));}
            return 0;
        }).collect(Collectors.toList());

        return ListaTemp;
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        uR.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody DatosUsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        DatosUsuario d=m.map(dto, DatosUsuario.class);
        uR.insert(d);
    }
}
