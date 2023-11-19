package pe.edu.upc.aaw.beeorganizedproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.beeorganizedproject.entities.Encuesta;

@Repository
public interface IEncuestaRepository extends JpaRepository<Encuesta, Integer> {
    @Query(value = "select id_encuesta from encuesta order by id_encuesta desc limit 1", nativeQuery = true)
    public int ultimaEncuestacreada();
}
