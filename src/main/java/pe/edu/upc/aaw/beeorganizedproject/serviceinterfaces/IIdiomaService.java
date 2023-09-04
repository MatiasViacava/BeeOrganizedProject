package pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces;

import pe.edu.upc.aaw.beeorganizedproject.entities.Idioma;

import java.util.List;

public interface IIdiomaService {
    public void insert(Idioma idioma);
    public List<Idioma> list();
    public void delete(int idIdioma);
}
