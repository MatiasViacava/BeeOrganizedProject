package pe.edu.upc.aaw.beeorganizedproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.beeorganizedproject.entities.Respuesta;
import pe.edu.upc.aaw.beeorganizedproject.repositories.IRespuestaRepository;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IRespuestaService;

import java.util.List;

@Service
public class RespuestaServiceImplement implements IRespuestaService {
    @Autowired
    private IRespuestaRepository rR;
    @Override
    public void insert(Respuesta respuesta){rR.save(respuesta);}
    @Override
    public List<Respuesta> list(){return rR.findAll();}

    @Override
    public void delete(int idRespuesta) {
        rR.deleteById(idRespuesta);
    }
    @Override
    public Respuesta listarId(int id) {
        return rR.findById(id).orElse(new Respuesta());
    }
    @Override
    public List<Respuesta> buscarPorIdUsuario(long id) {return rR.buscarPorIdUsuario(id);}
}
