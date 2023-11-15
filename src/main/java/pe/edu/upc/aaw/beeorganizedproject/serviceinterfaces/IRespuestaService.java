package pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces;

import pe.edu.upc.aaw.beeorganizedproject.entities.Respuesta;

import java.util.List;

public interface IRespuestaService {
    public void insert(Respuesta respuesta);

    public List<Respuesta> list();

    public void delete(int idRespuesta);

    public Respuesta listarId(int id);
    List<Respuesta> buscarPorIdUsuario(long id);

}
