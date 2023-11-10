package pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces;

import pe.edu.upc.aaw.beeorganizedproject.entities.Actividad;

import java.time.LocalDate;
import java.util.List;

public interface IActividadService {
    public void insert(Actividad actividad);
    public List<Actividad> List();
    public void delete(int idActividad);
    public List<String[]>CantidadDeActividadesMax();
    public int countActividadByFecha(LocalDate fechainicio, LocalDate fechafin);
    public Actividad listarId(int idActividad);
    public List<Actividad> findByHorarioUsuarioId(long id);
}
