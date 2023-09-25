package pe.edu.upc.aaw.beeorganizedproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.beeorganizedproject.entities.Configuracion;
import pe.edu.upc.aaw.beeorganizedproject.repositories.IConfiguracionRepository;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IConfiguracionService;

import java.util.List;

@Service
public class ConfiguracionServiceImplement implements IConfiguracionService {
    @Autowired
    private IConfiguracionRepository iC;
    @Override
    public void insert(Configuracion configuracion) {
        iC.save(configuracion);
    }
    @Override
    public List<Configuracion> list() {
        return iC.findAll();
    }
    @Override
    public void delete(int idConfiguracion) {
        iC.deleteById(idConfiguracion);
    }
    @Override
    public Configuracion listId(int idConfiguracion) {
        return iC.findById(idConfiguracion).orElse(new Configuracion());
    }
}
