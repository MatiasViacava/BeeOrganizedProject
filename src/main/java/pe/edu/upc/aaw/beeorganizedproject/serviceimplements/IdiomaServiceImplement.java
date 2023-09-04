package pe.edu.upc.aaw.beeorganizedproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.beeorganizedproject.entities.Idioma;
import pe.edu.upc.aaw.beeorganizedproject.repositories.IIdiomaRepository;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IIdiomaService;

import java.util.List;
@Service
public class IdiomaServiceImplement implements IIdiomaService {
    @Autowired
    private IIdiomaRepository iR;
    @Override
    public void insert(Idioma idioma) {
        iR.save(idioma);
    }

    @Override
    public List<Idioma> list() {
        return iR.findAll();
    }

    @Override
    public void delete(int idIdioma) {
        iR.deleteById(idIdioma);
    }
}
