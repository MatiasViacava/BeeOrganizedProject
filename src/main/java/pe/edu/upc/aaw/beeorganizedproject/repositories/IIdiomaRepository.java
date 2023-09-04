package pe.edu.upc.aaw.beeorganizedproject.repositories;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.beeorganizedproject.entities.Idioma;

import java.util.List;

@Repository
public interface IIdiomaRepository extends JpaRepository<Idioma, Integer> {

}
