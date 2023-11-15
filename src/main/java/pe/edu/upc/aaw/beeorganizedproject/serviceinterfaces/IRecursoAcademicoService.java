package pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces;

import pe.edu.upc.aaw.beeorganizedproject.entities.RecursoAcademico;

import java.time.LocalDate;
import java.util.List;

public interface IRecursoAcademicoService {
    public void insert(RecursoAcademico recursoAcademico);
    public List<RecursoAcademico> List();
    public void delete(int iD);
    public RecursoAcademico listarId(int id);
    List<RecursoAcademico> findByFechaPublicacion(LocalDate fechaPublicacion);
    List<RecursoAcademico> buscarPorIdUsuario(long id);
}
