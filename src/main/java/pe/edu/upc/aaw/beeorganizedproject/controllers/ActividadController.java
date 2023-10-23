package pe.edu.upc.aaw.beeorganizedproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.beeorganizedproject.dtos.ActividadDTO;
import pe.edu.upc.aaw.beeorganizedproject.dtos.CantActividadesIntervaloDTO;
import pe.edu.upc.aaw.beeorganizedproject.dtos.QueryActividadMAX;
import pe.edu.upc.aaw.beeorganizedproject.entities.Actividad;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IActividadService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/actividades")
public class ActividadController {
    @Autowired
    private IActividadService aS;
    @PostMapping
    public void registrar(@RequestBody ActividadDTO dto){
        ModelMapper m=new ModelMapper();
        Actividad d=m.map(dto,Actividad.class);
        aS.insert(d);
    }

    @GetMapping
    public List<ActividadDTO> Listar(){
        return aS.List().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ActividadDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        aS.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody ActividadDTO dto){
        ModelMapper m=new ModelMapper();
        Actividad d=m.map(dto,Actividad.class);
        aS.insert(d);

    }
    @GetMapping("/actividadesmaximas")
    public List<QueryActividadMAX> totalScoreTransactionComplete(){
        List<String[]> lista= aS.CantidadDeActividadesMax();
        List<QueryActividadMAX> listaSTO = new ArrayList<>();
        for (String[] data:lista){
            QueryActividadMAX dto = new QueryActividadMAX();
            dto.setDateActivity(LocalDate.parse(data[0]) );
            dto.setMaxActivity(Integer.parseInt(data[1]));
            listaSTO.add(dto);
        }
        return listaSTO;
    }
    @PostMapping("/CantActividadesEntreIntervalos")
    public int CantidadActivades(@RequestBody CantActividadesIntervaloDTO DTOCant){
        return  aS.countActividadByFecha(DTOCant.getFechainicio(),DTOCant.getFechafin());
    }
}
