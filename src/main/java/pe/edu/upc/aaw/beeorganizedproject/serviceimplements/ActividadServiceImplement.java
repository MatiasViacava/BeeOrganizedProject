package pe.edu.upc.aaw.beeorganizedproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.beeorganizedproject.entities.Actividad;
import pe.edu.upc.aaw.beeorganizedproject.repositories.IActividadRepository;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IActividadService;

import java.util.List;

@Service
public class ActividadServiceImplement implements IActividadService {
    @Autowired
    private IActividadRepository aR;

    @Override
    public void insert(Actividad actividad) {
        aR.save(actividad);
    }

    @Override
    public List<Actividad> List() {
        return aR.findAll();
    }

    @Override
    public void delete(int idActividad) {
        aR.deleteById(idActividad);
    }
}
