package pe.edu.upc.aaw.beeorganizedproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.beeorganizedproject.entities.TipoRecurso;
import pe.edu.upc.aaw.beeorganizedproject.repositories.ITipoRecursoRepository;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.ITipoRecursoService;

import java.util.List;

@Service
public class TipoRecursoServiceImplement implements ITipoRecursoService {
    @Autowired
    private ITipoRecursoRepository itR;
    @Override
    public void insert(TipoRecurso tipoRecurso) {
        itR.save(tipoRecurso);
    }

    @Override
    public List<TipoRecurso> list() {
        return itR.findAll();
    }

    @Override
    public void delete(int Id) {
        itR.deleteById(Id);
    }

    @Override
    public List<String[]> quantityTypeAcademicResource() {
        return itR.quantityTypeAcademicResource();
    }

}
