package pe.edu.upc.aaw.beeorganizedproject.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Actividad")

public class Actividad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idActividad;
    @Column(name = "nombreActividad",nullable = false,length = 80)
    private String nombreActividad;
    @Column(name = "descripcion",nullable = false,length = 150)
    private String descripcion;
    @Column(name = "estado",nullable = false,length = 80)
    private String estado;
    @Column(name = "calificacion",nullable = false)
    private int calificacion;
    @Column(name = "fecha",nullable = false)
    private LocalDate fecha;

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
        this.nombreActividad = nombreActividad;
        this.descripcion = descripcion;
        this.estado = estado;
        this.calificacion = calificacion;
        this.fecha = fecha;
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
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
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
