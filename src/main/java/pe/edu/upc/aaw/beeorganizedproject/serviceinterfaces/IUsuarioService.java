package pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces;

import pe.edu.upc.aaw.beeorganizedproject.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public void insert(Usuario usuario);
    public List<Usuario> list();
}
