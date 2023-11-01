package pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces;
import pe.edu.upc.aaw.beeorganizedproject.entities.TipoRecurso;
import pe.edu.upc.aaw.beeorganizedproject.entities.TiposUsuario;
import java.util.List;
public interface ITipoUsuarioService {
    public void insert(TiposUsuario tiposUsuario);
    public List<TiposUsuario> list();
    public void delete(int IDTipoUsuario);
    public TiposUsuario listarId(int id);
  
}
