package pe.edu.upc.aaw.beeorganizedproject.serviceimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.beeorganizedproject.entities.TipoUsuario;
import pe.edu.upc.aaw.beeorganizedproject.repositories.ITipoUsuarioRepository;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.ITipoUsuarioService;

import java.util.List;

@Service
public class TipoUsuarioServiceImplement implements ITipoUsuarioService {
    @Autowired
    private ITipoUsuarioRepository tR;

    @Override
    public void insert(TipoUsuario tipoUsuario) {
        tR.save(tipoUsuario);
    }

    @Override
    public List<TipoUsuario> list() {
        return tR.findAll();
    }
}
