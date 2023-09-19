package pe.edu.upc.aaw.beeorganizedproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.beeorganizedproject.entities.TipoActividad;

import java.util.List;

@Repository
public interface ITipoActividadRepository extends JpaRepository<TipoActividad,Integer> {

    @Query(value = "SELECT ta.nombre_tipo_actividad as Tipo_Actividad, count(*) as cantidad \n" +
            "from tipo_actividad ta group by ta.nombre_tipo_actividad", nativeQuery = true)
    public List<String[]> quantityTypeActivitie();
}
