package pe.edu.upc.aaw.beeorganizedproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.beeorganizedproject.entities.TipoActividad;

import java.util.List;

@Repository
public interface ITipoActividadRepository extends JpaRepository<TipoActividad,Integer> {

}
