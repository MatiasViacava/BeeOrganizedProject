package pe.edu.upc.aaw.beeorganizedproject.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Actividad")

public class Actividad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idActividad;
    @Column(name = "NombreActividad",nullable = false,length = 80)
    private String NombreActividad;
    @Column(name = "Descripcion",nullable = false,length = 150)
    private String Descripcion;
    @Column(name = "typeIngredient",nullable = false,length = 80)
    private String Estado;
    @Column(name = "Calificacion",nullable = false)
    private int Calificacion;
    @Column(name = "Fecha",nullable = false)
    private LocalDate Fecha;

    @ManyToOne
    @JoinColumn(name = "idHorario")
    private Horario horario;

    @ManyToOne
    @JoinColumn(name = "IDTipoactividad")
    private TipoActividad tipoActividad;
    @ManyToOne
    @JoinColumn(name = "idCurso")
    private Curso curso;

    public Actividad(){

    }
    public Actividad(int idActividad, String nombreActividad, String descripcion, String estado, int calificacion, LocalDate fecha, Horario horario, TipoActividad tipoActividad, Curso curso) {
        this.idActividad = idActividad;
        NombreActividad = nombreActividad;
        Descripcion = descripcion;
        Estado = estado;
        Calificacion = calificacion;
        Fecha = fecha;
        this.horario = horario;
        this.tipoActividad = tipoActividad;
        this.curso = curso;
    }

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public String getNombreActividad() {
        return NombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        NombreActividad = nombreActividad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public int getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(int calificacion) {
        Calificacion = calificacion;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate fecha) {
        Fecha = fecha;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public TipoActividad getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(TipoActividad tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
