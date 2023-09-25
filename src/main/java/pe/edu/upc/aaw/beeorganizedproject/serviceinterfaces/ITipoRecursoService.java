package pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces;


import pe.edu.upc.aaw.beeorganizedproject.entities.TipoRecurso;

import java.util.List;

public interface ITipoRecursoService {
    public void insert(TipoRecurso tipoRecurso);
    public List<TipoRecurso> list();
    public void delete(int Id);
    public List<String[]> quantityTypeAcademicResource();

}
