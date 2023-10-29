package pe.edu.upc.aaw.beeorganizedproject.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "RecursoAcademico")
public class RecursoAcademico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int iD;

    @Column(name = "enlaceRecurso",nullable = false,length = 255)
    private String enlaceRecurso;
    @Column(name = "nombreRecurso",nullable = false,length = 255)
    private String nombreRecurso;
    @Column(name = "autor",nullable = false,length = 255)
    private String autor;
    @Column(name = "descripcion",nullable = false,length = 255)
    private String descripcion;
    @Column(name = "fechaPublicacion",nullable = false)
    private Date fechaPublicacion;
    @ManyToOne
    @JoinColumn(name="tipoRecurso_ID")
    private TipoRecurso tipoRecurso_ID;
    @ManyToOne
    @JoinColumn(name = "curso_IDCurso")
    private Curso curso_IdCurso;
    public  RecursoAcademico(){

    }

    public RecursoAcademico(int iD, String enlaceRecurso, String nombreRecurso, String autor, String descripcion, Date fechaPublicacion, TipoRecurso tipoRecurso_ID, Curso curso_IdCurso) {
        this.iD = iD;
        this.enlaceRecurso = enlaceRecurso;
        this.nombreRecurso = nombreRecurso;
        this.autor = autor;
        this.descripcion = descripcion;
        this.fechaPublicacion = fechaPublicacion;
        this.tipoRecurso_ID = tipoRecurso_ID;
        this.curso_IdCurso = curso_IdCurso;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getEnlaceRecurso() {
        return enlaceRecurso;
    }

    public void setEnlaceRecurso(String enlaceRecurso) {
        this.enlaceRecurso = enlaceRecurso;
    }

    public String getNombreRecurso() {
        return nombreRecurso;
    }

    public void setNombreRecurso(String nombreRecurso) {
        this.nombreRecurso = nombreRecurso;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public TipoRecurso getTipoRecurso_ID() {
        return tipoRecurso_ID;
    }

    public void setTipoRecurso_ID(TipoRecurso tipoRecurso_ID) {
        this.tipoRecurso_ID = tipoRecurso_ID;
    }

    public Curso getCurso_IdCurso() {
        return curso_IdCurso;
    }

    public void setCurso_IdCurso(Curso curso_IdCurso) {
        this.curso_IdCurso = curso_IdCurso;
    }
}
