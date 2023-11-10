package pe.edu.upc.aaw.beeorganizedproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.beeorganizedproject.entities.Curso;
import pe.edu.upc.aaw.beeorganizedproject.repositories.ICursoRepository;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.ICursoService;

import java.util.List;

@Service
public class CursoServiceImplement implements ICursoService {
    @Autowired
    private ICursoRepository dC;
    @Override
    public void insert(Curso curso) {
        dC.save(curso);
    }

    @Override
    public List<Curso> list() {
        return dC.findAll();
    }

    @Override
    public void delete(int idCurso) {
        dC.deleteById(idCurso);
    }

    @Override
    public Curso listarId(int id) {
        return dC.findById(id).orElse(new Curso());
    }

    @Override
    public List<Curso> buscarPorIdUsuario(long id) {return dC.buscarPorIdUsuario(id);}
}
