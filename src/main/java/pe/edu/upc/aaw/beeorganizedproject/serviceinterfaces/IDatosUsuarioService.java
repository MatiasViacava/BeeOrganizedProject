package pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces;

import pe.edu.upc.aaw.beeorganizedproject.entities.DatosUsuario;

import java.util.List;

public interface IUsuarioService {
    public void insert(DatosUsuario datosUsuario);
    public List<DatosUsuario> list();
    public void delete(int IDUsuario);
}
