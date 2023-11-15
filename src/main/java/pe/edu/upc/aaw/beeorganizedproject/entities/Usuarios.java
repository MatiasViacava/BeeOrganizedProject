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
	@Column(name = "nombres", length = 50, nullable = false)
	private String nombres;
	@Column(name = "apellidos", length = 50, nullable = false)
	private String apellidos;
	@Column(name = "fechaNacimiento",nullable = false)
	private LocalDate fechaNacimiento;
	@Column(name = "universidad", length = 50, nullable = false)
	private String universidad;
	@Column(name = "email", length = 50, nullable = false)
	private String email;
	//

	public Usuarios(){}

	public Usuarios(Long id, String username, String password, Boolean enabled, List<TiposUsuario> tipos_usuario, String nombres, String apellidos, LocalDate fechaNacimiento, String universidad, String email) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.tipos_usuario = tipos_usuario;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.universidad = universidad;
		this.email = email;
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
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}