package pe.edu.upc.aaw.beeorganizedproject.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable {

	//Parte de la actualización security
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 30, unique = true)
	private String username;
	@Column(length = 200)
	private String password;
	private Boolean enabled;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "usuario_id")
	private List<TiposUsuario> tipos_usuario;
	//

	//Datos generales
	@Column(name = "Nombres", length = 50, nullable = false)
	private String Nombres;
	@Column(name = "Apellidos", length = 50, nullable = false)
	private String Apellidos;
	@Column(name = "FechaNacimiento",nullable = false)
	private LocalDate FechaNacimiento;
	@Column(name = "Universidad", length = 50, nullable = false)
	private String Universidad;
	@Column(name = "Email", length = 50, nullable = false)
	private String Email;
	//

	public Usuarios(){}

	public Usuarios(Long id, String username, String password, Boolean enabled, List<TiposUsuario> tipos_usuario, String nombres, String apellidos, LocalDate fechaNacimiento, String universidad, String email) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.tipos_usuario = tipos_usuario;
		Nombres = nombres;
		Apellidos = apellidos;
		FechaNacimiento = fechaNacimiento;
		Universidad = universidad;
		Email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public List<TiposUsuario> getTipos_usuario() {
		return tipos_usuario;
	}

	public void setTipos_usuario(List<TiposUsuario> tipos_usuario) {
		this.tipos_usuario = tipos_usuario;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public LocalDate getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

	public String getUniversidad() {
		return Universidad;
	}

	public void setUniversidad(String universidad) {
		Universidad = universidad;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

}