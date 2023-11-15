package pe.edu.upc.aaw.beeorganizedproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.beeorganizedproject.entities.Curso;

import java.util.List;

@Repository
public interface ICursoRepository extends JpaRepository<Curso,Integer> {

    @Query(value = "SELECT curso.* \n" +
            "FROM curso \n" +
            "INNER JOIN actividad ON curso.id_curso = actividad.id_curso\n" +
            "INNER JOIN horario ON actividad.id_horario = horario.id_horario\n" +
            "INNER JOIN usuarios ON horario.usuario_id = usuarios.id\n" +
            "WHERE usuarios.id = :id",nativeQuery = true)
    List<Curso> buscarPorIdUsuario(long id);
}
