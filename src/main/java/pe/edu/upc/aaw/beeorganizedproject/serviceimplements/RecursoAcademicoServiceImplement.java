package pe.edu.upc.aaw.beeorganizedproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.beeorganizedproject.entities.RecursoAcademico;
import pe.edu.upc.aaw.beeorganizedproject.repositories.IRecursoAcademicoRepository;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IRecursoAcademicoService;

import java.util.List;

@Service
public class RecursoAcademicoServiceImplement implements IRecursoAcademicoService {
    @Autowired
    public IRecursoAcademicoRepository iraR;
    @Override
    public void insert(RecursoAcademico recursoAcademico) {
        iraR.save(recursoAcademico);
    }

    @Override
    public List<RecursoAcademico> List() {
        return iraR.findAll();
    }

    @Override
    public void delete(int idrecurso) {
        iraR.deleteById(idrecurso);
    }
    @Override
    public RecursoAcademico listarId(int id) {
        return iraR.findById(id).orElse(new RecursoAcademico());
    }
}
