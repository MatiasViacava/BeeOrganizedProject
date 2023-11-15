package pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces;

import pe.edu.upc.aaw.beeorganizedproject.entities.Usuarios;

import java.time.LocalDate;
import java.util.List;

public interface IUsuarioService {
    public void insert(Usuarios datosUsuario);
    public List<Usuarios> list();
    public void delete(long IDUsuario);
    public Usuarios listarId(Long id);

    public List<Usuarios> findByNombres(String nombres);

    public int ultimoUsuarioCreado();

    public void actualizarUsuario(long id, String p1, String p2, Boolean p3, String p4, String p5, LocalDate p6, String p7, String p8);

}
