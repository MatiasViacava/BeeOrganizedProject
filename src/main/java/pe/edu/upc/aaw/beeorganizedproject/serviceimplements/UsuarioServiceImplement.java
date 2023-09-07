package pe.edu.upc.aaw.beeorganizedproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.beeorganizedproject.entities.Usuario;
import pe.edu.upc.aaw.beeorganizedproject.repositories.IUsuarioRepository;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {
    @Autowired
    private IUsuarioRepository iU;
    @Override
    public void insert(Usuario usuario) {
        iU.save(usuario);
    }

    @Override
    public List<Usuario> list() {
        return iU.findAll();
    }

    @Override
    public void delete(int IDUsuario) {
        iU.deleteById(IDUsuario);
    }
}
