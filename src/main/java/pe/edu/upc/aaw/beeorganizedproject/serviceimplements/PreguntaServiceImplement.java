package pe.edu.upc.aaw.beeorganizedproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.beeorganizedproject.entities.Pregunta;
import pe.edu.upc.aaw.beeorganizedproject.repositories.IPreguntaRepository;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IPreguntaService;

import java.util.List;

@Service
public class PreguntaServiceImplement implements IPreguntaService {
    @Autowired
    private IPreguntaRepository pR;
    @Override
    public void insert(Pregunta pregunta){pR.save(pregunta);}
    @Override
    public List<Pregunta> list(){return pR.findAll();}

    @Override
    public void delete(int idPregunta) {
        pR.deleteById(idPregunta);

    }

    @Override
    public Pregunta listarId(int id) {
        return pR.findById(id).orElse(new Pregunta());
    }
}
