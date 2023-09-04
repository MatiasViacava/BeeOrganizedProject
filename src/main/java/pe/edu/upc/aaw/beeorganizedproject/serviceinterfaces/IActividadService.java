package pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces;

import pe.edu.upc.aaw.beeorganizedproject.entities.Actividad;
import pe.edu.upc.aaw.beeorganizedproject.entities.Horario;

import java.util.List;

public interface IActividadService {
    public void insert(Actividad actividad);
    public List<Actividad> List();
    public void delete(int idActividad);
}
