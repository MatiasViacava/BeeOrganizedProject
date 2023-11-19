package pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces;

import pe.edu.upc.aaw.beeorganizedproject.entities.Encuesta;

import java.util.List;

public interface IEncuestaService {
    void insert(Encuesta encuesta);

    List<Encuesta> list();

    public void delete(int idEncuesta);

    public Encuesta listarId(int id);

    public int ultimaEncuestacreada();
}
