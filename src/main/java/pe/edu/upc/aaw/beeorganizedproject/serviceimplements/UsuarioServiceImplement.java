package pe.edu.upc.aaw.beeorganizedproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.beeorganizedproject.entities.Usuarios;
import pe.edu.upc.aaw.beeorganizedproject.repositories.IUsuarioRepository;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IUsuarioService;

import java.time.LocalDate;
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

    @Override
    public List<Usuarios> findByNombres(String nombres) {
        return iU.findByNombres(nombres);
    }

    public List<Usuarios> findById(long id) {return iU.findById(id);}

    @Override
    public int ultimoUsuarioCreado() {return iU.ultimoUsuarioCreado();}

    @Override
    public void actualizarUsuario(long id, String p1, String p2, Boolean p3, String p4, String p5, LocalDate p6, String p7, String p8)
    { iU.actualizarUsuario(id, p1, p2, p3, p4, p5, p6, p7, p8);}
}
