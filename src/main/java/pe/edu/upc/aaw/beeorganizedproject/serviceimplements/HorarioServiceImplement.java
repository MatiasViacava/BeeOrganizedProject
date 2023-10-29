package pe.edu.upc.aaw.beeorganizedproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.beeorganizedproject.entities.Horario;
import pe.edu.upc.aaw.beeorganizedproject.entities.TipoActividad;
import pe.edu.upc.aaw.beeorganizedproject.repositories.IHorarioRepository;
import pe.edu.upc.aaw.beeorganizedproject.serviceinterfaces.IHorarioService;

import java.util.List;

@Service
public class HorarioServiceImplement implements IHorarioService {
    @Autowired
    private IHorarioRepository hR;

    @Override
    public void insert(Horario horario) {
        hR.save(horario);
    }

    @Override
    public List<Horario> List() {
        return hR.findAll();
    }

    @Override
    public void delete(int idHorario) {
        hR.deleteById(idHorario);
    }

    @Override
    public Horario listarId(int idHorario) {
        return hR.findById(idHorario).orElse(new Horario());
    }
}
