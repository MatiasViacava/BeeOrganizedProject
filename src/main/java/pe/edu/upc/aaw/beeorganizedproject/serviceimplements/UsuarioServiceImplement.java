package pe.edu.upc.aaw.beeorganizedproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.beeorganizedproject.entities.Usuarios;
import pe.edu.upc.aaw.beeorganizedproject.repositories.IUsuarioRepository;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {
    @Autowired
    private IUsuarioRepository iU;
    @Override
    public void insert(Usuarios datosUsuario) {
        iU.save(datosUsuario);
    }

    @Override
    public List<Usuarios> list() {
        return iU.findAll();
    }

    @Override
    public void delete(long IDUsuario) {
        iU.deleteById(IDUsuario);
    }

    @Override
    public Usuarios listarId(Long id) {
        return iU.findById(id).orElse(new Usuarios());
    }
}
