package pe.edu.upc.aaw.beeorganizedproject.serviceimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.beeorganizedproject.entities.RecursoAcademico;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IRecursoAcademicoService;

import java.util.List;

@Service
public class RecursoAcademicoServiceImplement implements IRecursoAcademicoService {
    @Override
    public void insert(RecursoAcademico recursoAcademico) {

    }

    @Override
    public List<RecursoAcademico> List() {
        return null;
    }

    @Override
    public void delete(int idrecurso) {

    }
}
