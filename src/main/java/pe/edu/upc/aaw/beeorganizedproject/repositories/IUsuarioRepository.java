package pe.edu.upc.aaw.beeorganizedproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.aaw.beeorganizedproject.entities.Usuarios;


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

}