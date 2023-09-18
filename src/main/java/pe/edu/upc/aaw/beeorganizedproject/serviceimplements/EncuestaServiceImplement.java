package pe.edu.upc.aaw.beeorganizedproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.beeorganizedproject.entities.Encuesta;
import pe.edu.upc.aaw.beeorganizedproject.repositories.IEncuestaRepository;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IEncuestaService;

import java.util.List;

@Service
public class EncuestaServiceImplement implements IEncuestaService {
    @Autowired
    private IEncuestaRepository eR;
    @Override
    public void insert(Encuesta encuesta) {eR.save(encuesta);}
    @Override
    public List<Encuesta> list() {return eR.findAll();}

    @Override
    public void delete(int idEncuesta) {
        eR.deleteById(idEncuesta);
    }
}
