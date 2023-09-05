package pe.edu.upc.aaw.beeorganizedproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.beeorganizedproject.entities.Respuesta;

@Repository
public interface IRespuestaRepository extends JpaRepository<Respuesta, Integer> {
}
