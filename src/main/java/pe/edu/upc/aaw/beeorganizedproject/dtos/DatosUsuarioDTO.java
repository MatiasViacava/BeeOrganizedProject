package pe.edu.upc.aaw.beeorganizedproject.dtos;

import pe.edu.upc.aaw.beeorganizedproject.entities.TiposUsuario;

import java.time.LocalDate;

public class DatosUsuarioDTO {
    private int idUsuario;
    private String Nombres;
    private String Apellidos;
    private LocalDate FechaNacimiento;
    private String Universidad;
    private String Email;
    private String Contraseña;
    private TiposUsuario tiposUsuario;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    public TiposUsuario getTipoUsuario() {
        return tiposUsuario;
    }

    public void setTipoUsuario(TiposUsuario tiposUsuario) {
        this.tiposUsuario = tiposUsuario;
    }
}
