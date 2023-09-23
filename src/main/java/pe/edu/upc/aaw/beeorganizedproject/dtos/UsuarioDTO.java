package pe.edu.upc.aaw.beeorganizedproject.dtos;

import pe.edu.upc.aaw.beeorganizedproject.entities.TiposUsuario;

import java.time.LocalDate;
import java.util.List;

public class UsuarioDTO {
    private Long id;
    private String username;
    private String password;
    private Boolean enabled;
    //private List<TiposUsuario> tipos_usuario;
    private String Nombres;
    private String Apellidos;
    private LocalDate FechaNacimiento;
    private String Universidad;
    private String Email;

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

    /*public List<TiposUsuario> getTipos_usuario() {
        return tipos_usuario;
    }

    public void setTipos_usuario(List<TiposUsuario> tipos_usuario) {
        this.tipos_usuario = tipos_usuario;
    }

     */

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
