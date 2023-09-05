package pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces;
import pe.edu.upc.aaw.beeorganizedproject.entities.TipoUsuario;
import java.util.List;
public interface ITipoUsuarioService {
    public void insert(TipoUsuario tipoUsuario);
    public List<TipoUsuario> list();
    public void delete(int IDTipoUsuario);
  
}
