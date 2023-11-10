package pe.edu.upc.aaw.beeorganizedproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.beeorganizedproject.entities.Configuracion;

import java.util.List;

@Repository
public interface IConfiguracionRepository extends JpaRepository<Configuracion, Integer> {
    List<Configuracion> findByUsuarioId(long id);
}
