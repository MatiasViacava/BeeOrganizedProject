package pe.edu.upc.aaw.beeorganizedproject.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "RecursoAcademico")
public class RecursoAcademico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(name = "EnlaceRecurso",nullable = false,length = 255)
    private String EnlaceRecurso;
    @Column(name = "NombreRecurso",nullable = false,length = 255)
    private String NombreRecurso;
    @Column(name = "Autor",nullable = false,length = 255)
    private String Autor;
    @Column(name = "Descripcion",nullable = false,length = 255)
    private String Descripcion;
    @Column(name = "FechaPublicacion",nullable = false)
    private Date FechaPublicacion;
    @ManyToOne
    @JoinColumn(name="TipoRecurso_ID")
    private TipoRecurso tipoRecurso_ID;
    @ManyToOne
    @JoinColumn(name = "Curso_IDCurso")
    private Curso curso_IdCurso;
    public  RecursoAcademico(){

    }

    public RecursoAcademico(int ID, String enlaceRecurso, String nombreRecurso, String autor, String descripcion, Date fechaPublicacion, TipoRecurso tipoRecurso_ID, Curso curso_IdCurso) {
        this.ID = ID;
        EnlaceRecurso = enlaceRecurso;
        NombreRecurso = nombreRecurso;
        Autor = autor;
        Descripcion = descripcion;
        FechaPublicacion = fechaPublicacion;
        this.tipoRecurso_ID = tipoRecurso_ID;
        this.curso_IdCurso = curso_IdCurso;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEnlaceRecurso() {
        return EnlaceRecurso;
    }

    public void setEnlaceRecurso(String enlaceRecurso) {
        EnlaceRecurso = enlaceRecurso;
    }

    public String getNombreRecurso() {
        return NombreRecurso;
    }

    public void setNombreRecurso(String nombreRecurso) {
        NombreRecurso = nombreRecurso;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Date getFechaPublicacion() {
        return FechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        FechaPublicacion = fechaPublicacion;
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
