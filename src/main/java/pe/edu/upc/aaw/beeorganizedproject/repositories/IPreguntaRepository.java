package pe.edu.upc.aaw.beeorganizedproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.beeorganizedproject.entities.Pregunta;

import java.util.List;

@Repository
public interface IPreguntaRepository extends JpaRepository<Pregunta, Integer> {
    @Query(value = "SELECT pregunta.*\n" +
            "FROM usuarios\n" +
            "JOIN encuesta ON usuarios.id = encuesta.usuario_id\n" +
            "JOIN pregunta ON encuesta.id_encuesta = Pregunta.id_encuesta\n" +
            "WHERE usuarios.id = :id",nativeQuery = true)
    List<Pregunta> buscarPorIdUsuario(long id);
}
