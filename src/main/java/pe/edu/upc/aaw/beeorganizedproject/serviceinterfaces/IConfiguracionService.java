package pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces;

import pe.edu.upc.aaw.beeorganizedproject.entities.Configuracion;

import java.util.List;

public interface IConfiguracionService {
    //APARTADO IDIOMA
    public void insert(Configuracion configuracion);
    public List<Configuracion> list();
    public void delete(int idConfiguracion);
    public Configuracion listId(int idConfiguracion);
}
