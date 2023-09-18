package pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces;

import pe.edu.upc.aaw.beeorganizedproject.entities.Usuarios;

import java.util.List;

public interface IUsuarioService {
    public void insert(Usuarios datosUsuario);
    public List<Usuarios> list();
    public void delete(long IDUsuario);
}
