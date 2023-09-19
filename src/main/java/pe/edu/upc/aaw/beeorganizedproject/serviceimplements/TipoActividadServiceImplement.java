package pe.edu.upc.aaw.beeorganizedproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.beeorganizedproject.entities.TipoActividad;
import pe.edu.upc.aaw.beeorganizedproject.repositories.ITipoActividadRepository;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.ITipoActividadService;

import java.util.List;

@Service
public class TipoActividadServiceImplement implements ITipoActividadService {
    @Autowired
    private ITipoActividadRepository taR;

    @Override
    public void insert(TipoActividad tipoActividad) {
        taR.save(tipoActividad);
    }

    @Override
    public List<TipoActividad> List() {
        return taR.findAll();
    }

    @Override
    public void delete(int IDTipoActividad) {
        taR.deleteById(IDTipoActividad);
    }

    @Override
    public List<String[]> quantityTypeActivitie() {
        return taR.quantityTypeActivitie();
    }

}
