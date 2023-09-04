package pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces;

import pe.edu.upc.aaw.beeorganizedproject.entities.TipoActividad;

import java.util.List;

public interface ITipoActividadService {
    public void insert(TipoActividad tipoActividad);
    public List<TipoActividad> List();

    public void delete(int IDTipoActividad);

}
