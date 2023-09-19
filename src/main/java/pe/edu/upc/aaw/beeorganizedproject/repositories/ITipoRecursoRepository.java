package pe.edu.upc.aaw.beeorganizedproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.beeorganizedproject.entities.TipoRecurso;

import java.util.List;

@Repository
public interface ITipoRecursoRepository extends JpaRepository<TipoRecurso,Integer> {
    @Query(value = "select tr.nombre_tipo, count(ra.id)\n" +
            " from tipo_recurso tr inner join recurso_academico ra\n" +
            " on tr.id=ra.tipo_recurso_id\n" +
            " group by tr.nombre_tipo", nativeQuery = true)
    public List<String[]> quantityTypeAcademicResource();
}
