package pe.edu.upc.aaw.beeorganizedproject.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "DatosUsuario")
public class DatosUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDatosUsuario;
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
    @Column(name = "Contraseña", length = 50, nullable = false)
    private String Contraseña;
    @ManyToOne
    @JoinColumn(name = "idTipoUsuario")
    private TiposUsuario tiposUsuario;
    public DatosUsuario() {
    }

    public int getIdDatosUsuario() {
        return idDatosUsuario;
    }

    public void setIdDatosUsuario(int idDatosUsuario) {
        this.idDatosUsuario = idDatosUsuario;
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
