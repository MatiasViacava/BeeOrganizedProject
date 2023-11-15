package pe.edu.upc.aaw.beeorganizedproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.beeorganizedproject.dtos.CantTipoActividadDTO;
import pe.edu.upc.aaw.beeorganizedproject.dtos.QueryCantTipoactividadPorUsuarioDTO;
import pe.edu.upc.aaw.beeorganizedproject.dtos.TipoActividadDTO;
import pe.edu.upc.aaw.beeorganizedproject.dtos.UsuarioDTO;
import pe.edu.upc.aaw.beeorganizedproject.entities.TipoActividad;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.ITipoActividadService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tiposactividades")
public class TipoActividadController {
    @Autowired
    private ITipoActividadService taS;

    @PostMapping
    public void registrar(@RequestBody TipoActividadDTO dto){
        ModelMapper m=new ModelMapper();
        TipoActividad d=m.map(dto,TipoActividad.class);
        taS.insert(d);
    }
    @GetMapping
    public List<TipoActividadDTO> Listar(){
        return taS.List().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,TipoActividadDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        taS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody TipoActividadDTO dto){
        ModelMapper m=new ModelMapper();
        TipoActividad d=m.map(dto,TipoActividad.class);
        taS.insert(d);
    }

    @GetMapping("/cantidades")
    public List<CantTipoActividadDTO> cantTypeActivitie(){
        List<String[]> lista=taS.quantityTypeActivitie();
        List<CantTipoActividadDTO> listaDTO=new ArrayList<>();
        for (String[] data:lista){
            CantTipoActividadDTO dto=new CantTipoActividadDTO();
            dto.setTipo_Actividad(data[0]);
            dto.setCantidad(Integer.parseInt(data[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }

    @GetMapping("/cantidadesporusuario")
    public List<QueryCantTipoactividadPorUsuarioDTO> cantTypeActivitieExtracurricular(){
        List<String[]> lista=taS.quantityTypeActivitieExtracurricular();
        List<QueryCantTipoactividadPorUsuarioDTO> listaDTO=new ArrayList<>();
        for (String[] data:lista){
            QueryCantTipoactividadPorUsuarioDTO dto=new QueryCantTipoactividadPorUsuarioDTO();
            dto.setNombreUsuario(data[0]);
            dto.setCantTipoactividadPorUsuarioDTO(Integer.parseInt(data[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }

    @GetMapping("/{id}")
    public TipoActividadDTO listarId(@PathVariable("id") int iDTipoActividad) {
        ModelMapper m=new ModelMapper();
        TipoActividadDTO dto=m.map(taS.listarId(iDTipoActividad),TipoActividadDTO.class);
        return dto;
    }
}
