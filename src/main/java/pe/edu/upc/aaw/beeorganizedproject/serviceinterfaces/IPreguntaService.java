package pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces;

import pe.edu.upc.aaw.beeorganizedproject.entities.Pregunta;

import java.util.List;

public interface IPreguntaService {

    void insert(Pregunta pregunta);

    List<Pregunta> list();

    public void delete(int idPregunta);
}
