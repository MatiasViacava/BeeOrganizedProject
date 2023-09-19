package pe.edu.upc.aaw.beeorganizedproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.beeorganizedproject.entities.Actividad;

import java.time.LocalDate;

@Repository
public interface IActividadRepository extends JpaRepository<Actividad, Integer> {
    @Query(value = "select count(*) from actividad where fecha between :fechainicio and :fechafin",nativeQuery = true)
    public int countActividadByFecha(LocalDate fechainicio,LocalDate fechafin);

}
