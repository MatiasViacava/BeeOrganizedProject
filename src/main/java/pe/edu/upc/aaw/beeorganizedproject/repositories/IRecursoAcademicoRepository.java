package pe.edu.upc.aaw.beeorganizedproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.beeorganizedproject.entities.RecursoAcademico;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IRecursoAcademicoRepository extends JpaRepository<RecursoAcademico,Integer> {
    List<RecursoAcademico> findByFechaPublicacion(LocalDate fechaPublicacion);

    @Query(value = "SELECT DISTINCT recurso_academico.*\n" +
            "FROM usuarios\n" +
            "JOIN horario ON usuarios.id = horario.usuario_id\n" +
            "JOIN actividad ON horario.id_horario = actividad.id_horario\n" +
            "JOIN curso ON actividad.id_curso = curso.id_curso\n" +
            "JOIN recurso_academico ON curso.id_curso = recurso_academico.curso_idcurso\n" +
            "WHERE usuarios.id = :id",nativeQuery = true)
    List<RecursoAcademico> buscarPorIdUsuario(long id);
}
