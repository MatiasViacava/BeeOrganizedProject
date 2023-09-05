package pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces;

import pe.edu.upc.aaw.beeorganizedproject.entities.Curso;

import java.util.List;

public interface ICursoService {
    public void insert(Curso curso);
    public List<Curso> list();
    public void delete(int idCurso);
}
