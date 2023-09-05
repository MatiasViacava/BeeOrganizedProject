package pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces;

import pe.edu.upc.aaw.beeorganizedproject.entities.Horario;
import pe.edu.upc.aaw.beeorganizedproject.entities.TipoActividad;

import java.util.List;

public interface IHorarioService {
    public void insert(Horario horario);
    public List<Horario> List();
    public void delete(int idHorario);
}
