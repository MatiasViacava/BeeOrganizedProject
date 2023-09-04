package pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces;

import pe.edu.upc.aaw.beeorganizedproject.entities.Configuracion;
import pe.edu.upc.aaw.beeorganizedproject.entities.Idioma;
import pe.edu.upc.aaw.beeorganizedproject.entities.Usuario;

import java.util.List;

public interface IConfiguracionService {
    //APARTADO IDIOMA
    public void insert(Configuracion configuracion);
    public List<Configuracion> list();
    public void delete(int idConfiguracion);
    public Configuracion listId(int idConfiguracion);

    //APARTADO IDIOMA
}
