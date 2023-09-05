package pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces;

import pe.edu.upc.aaw.beeorganizedproject.entities.RecursoAcademico;

import java.util.List;

public interface IRecursoAcademicoService {
    public void insert(RecursoAcademico recursoAcademico);
    public List<RecursoAcademico> List();
    public void delete(int idrecurso);
}
