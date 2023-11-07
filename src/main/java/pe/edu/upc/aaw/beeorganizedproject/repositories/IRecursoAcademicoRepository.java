package pe.edu.upc.aaw.beeorganizedproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.beeorganizedproject.entities.RecursoAcademico;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IRecursoAcademicoRepository extends JpaRepository<RecursoAcademico,Integer> {
    List<RecursoAcademico> findByFechaPublicacion(LocalDate fechaPublicacion);
}
