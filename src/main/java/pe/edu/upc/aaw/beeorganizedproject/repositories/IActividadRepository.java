package pe.edu.upc.aaw.beeorganizedproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.beeorganizedproject.entities.Actividad;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IActividadRepository extends JpaRepository<Actividad, Integer> {
    @Query(value = "SELECT fecha, MAX(cantidad_actividades) as max_actividades\n" +
            " FROM (\n" +
            "     SELECT fecha, COUNT(*) as cantidad_actividades\n" +
            "     FROM actividad\n" +
            "     GROUP BY fecha\n" +
            " ) subquery group by fecha limit 1;", nativeQuery = true)
    public List<String[]>CantidadDeActividadesMax();
  
   @Query(value = "select count(*) from actividad where fecha between :fechainicio and :fechafin",nativeQuery = true)
    public int countActividadByFecha(LocalDate fechainicio,LocalDate fechafin);

   List<Actividad> findByHorarioUsuarioId(long id);


}
