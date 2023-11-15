package pe.edu.upc.aaw.beeorganizedproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.beeorganizedproject.entities.Respuesta;

import java.util.List;

@Repository
public interface IRespuestaRepository extends JpaRepository<Respuesta, Integer> {
    @Query(value = "SELECT respuesta.*\n" +
            "FROM usuarios\n" +
            "JOIN encuesta ON usuarios.id = encuesta.usuario_id\n" +
            "JOIN pregunta ON encuesta.id_encuesta = Pregunta.id_encuesta\n" +
            "JOIN respuesta ON pregunta.id_pregunta = respuesta.id_pregunta\n" +
            "WHERE usuarios.id = :id",nativeQuery = true)
    List<Respuesta> buscarPorIdUsuario(long id);
}
