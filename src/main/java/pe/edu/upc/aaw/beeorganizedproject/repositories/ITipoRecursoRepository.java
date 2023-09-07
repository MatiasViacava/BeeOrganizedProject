package pe.edu.upc.aaw.beeorganizedproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.beeorganizedproject.entities.TipoRecurso;

@Repository
public interface ITipoRecursoRepository extends JpaRepository<TipoRecurso,Integer> {
}
