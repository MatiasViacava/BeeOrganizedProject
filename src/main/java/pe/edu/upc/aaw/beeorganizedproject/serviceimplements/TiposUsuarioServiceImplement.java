package pe.edu.upc.aaw.beeorganizedproject.serviceimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.beeorganizedproject.entities.TipoRecurso;
import pe.edu.upc.aaw.beeorganizedproject.entities.TiposUsuario;
import pe.edu.upc.aaw.beeorganizedproject.entities.Usuarios;
import pe.edu.upc.aaw.beeorganizedproject.repositories.ITiposUsuarioRepository;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.ITipoUsuarioService;

import java.util.List;

@Service
public class TiposUsuarioServiceImplement implements ITipoUsuarioService {
    @Autowired
    private ITiposUsuarioRepository tR;

    @Override
    public void insert(TiposUsuario tiposUsuario) {
        tR.save(tiposUsuario);
    }

    @Override
    public List<TiposUsuario> list() {
        return tR.findAll();
    }

    @Override
    public void delete(int idTipoUsuario) {
        tR.deleteById(idTipoUsuario);
    }

    @Override
    public TiposUsuario listarId(int id) {
        return tR.findById(id).orElse(new TiposUsuario());
    }
}
