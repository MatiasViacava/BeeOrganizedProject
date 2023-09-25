package pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces;
import pe.edu.upc.aaw.beeorganizedproject.entities.TiposUsuario;
import java.util.List;
public interface ITipoUsuarioService {
    public void insert(TiposUsuario tiposUsuario);
    public List<TiposUsuario> list();
    public void delete(int IDTipoUsuario);
  
}
