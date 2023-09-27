package pe.edu.upc.aaw.beeorganizedproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.beeorganizedproject.entities.TipoActividad;

import java.util.List;

@Repository
public interface ITipoActividadRepository extends JpaRepository<TipoActividad,Integer> {

    @Query(value = "SELECT ta.nombre_tipo_actividad as Tipo_Actividad, count(*) as cantidad from tipo_actividad ta\n" +
            " join actividad on ta.idtipo_actividad=actividad.idtipoactividad\n" +
            " group by ta.nombre_tipo_actividad", nativeQuery = true)
    public List<String[]> quantityTypeActivitie();

    @Query(value = "select CONCAT(u.nombres,' ',u.apellidos) as NombreCompleto, \n" +
            " count(*) from tipo_actividad ta \n" +
            " join Actividad a on ta.idtipo_actividad=a.idtipoactividad\n" +
            " join Horario h on a.id_horario=h.id_horario\n" +
            " join Usuarios u on u.id=h.usuario_id\n" +
            " where ta.nombre_tipo_actividad='Extracurricular' group by NombreCompleto", nativeQuery = true)
    public List<String[]> quantityTypeActivitieExtracurricular();

}
