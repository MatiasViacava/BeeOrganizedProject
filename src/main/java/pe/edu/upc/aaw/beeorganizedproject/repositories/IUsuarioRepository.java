package pe.edu.upc.aaw.beeorganizedproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.aaw.beeorganizedproject.entities.Usuarios;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface IUsuarioRepository extends JpaRepository<Usuarios, Long> {
	public Usuarios findByUsername(String username);
	
	//BUSCAR POR NOMBRE
	@Query("select count(u.username) from Usuarios u where u.username =:username")
	public int buscarUsername(@Param("username") String nombre);
	
	
	//INSERTAR ROLES
	@Transactional
	@Modifying
	@Query(value = "insert into tipos_usuario (tipo_usuario, usuario_id) VALUES (:tipo_usuario, :usuario_id)", nativeQuery = true)
	public void insRol(@Param("tipo_usuario") String authority, @Param("usuario_id") Long usuario_id);

	//BUSCAR POR NOMBRE - CHISDE
	List<Usuarios> findByNombres(String nombres);

	List<Usuarios> findById(long id);

	@Query(value = "select id from usuarios order by id desc limit 1", nativeQuery = true)
	public int ultimoUsuarioCreado();

	@Transactional
	@Modifying
	@Query(value= "UPDATE usuarios\n" +
			"SET username=:p1, password=:p2, enabled=:p3, nombres=:p4, apellidos=:p5, fecha_nacimiento=:p6, " +
			"universidad=:p7, email=:p8\n" +
			"WHERE id = :id",nativeQuery = true)
	public void actualizarUsuario(long id, String p1, String p2, Boolean p3, String p4, String p5, LocalDate p6, String p7, String p8);

}