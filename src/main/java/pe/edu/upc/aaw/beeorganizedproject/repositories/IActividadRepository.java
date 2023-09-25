package pe.edu.upc.aaw.beeorganizedproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.beeorganizedproject.entities.Actividad;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IActividadRepository extends JpaRepository<Actividad, Integer> {
    @Query(value = "select fecha, max(1) from\n" +
            " (select a.fecha,count(*) from actividad a group by a.fecha) as ALIASTIP group by fecha", nativeQuery = true)
    public List<String[]>CantidadDeActividadesMax();
  
   @Query(value = "select count(*) from actividad where fecha between :fechainicio and :fechafin",nativeQuery = true)
    public int countActividadByFecha(LocalDate fechainicio,LocalDate fechafin);


}
