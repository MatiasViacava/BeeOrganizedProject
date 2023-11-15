package pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces;

import pe.edu.upc.aaw.beeorganizedproject.entities.Idioma;
import pe.edu.upc.aaw.beeorganizedproject.entities.Pregunta;

import java.util.List;

public interface IPreguntaService {

    void insert(Pregunta pregunta);

    List<Pregunta> list();

    public void delete(int idPregunta);
    public Pregunta listarId(int id);

    List<Pregunta> buscarPorIdUsuario(long id);
}
