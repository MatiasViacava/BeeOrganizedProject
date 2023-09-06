package pe.edu.upc.aaw.beeorganizedproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.beeorganizedproject.entities.DatosUsuario;
import pe.edu.upc.aaw.beeorganizedproject.repositories.IUsuarioRepository;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {
    @Autowired
    private IUsuarioRepository iU;
    @Override
    public void insert(DatosUsuario datosUsuario) {
        iU.save(datosUsuario);
    }

    @Override
    public List<DatosUsuario> list() {
        return iU.findAll();
    }

    @Override
    public void delete(int IDUsuario) {
        iU.deleteById(IDUsuario);
    }
}
