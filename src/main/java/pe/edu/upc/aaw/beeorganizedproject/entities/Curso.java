package pe.edu.upc.aaw.beeorganizedproject.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCurso;
    @Column(name = "nombreCurso",nullable = false,length = 45)
    private  String nombreCurso;
    @Column(name = "fescripcionCurso",nullable = false,length = 45)
    private  String descripcionCurso;
    @Column(name = "fechaInicioCurso",nullable = false)
    private LocalDate fechaInicioCurso;
    @Column(name = "fechaFinCurso",nullable = false)
    private LocalDate fechaFinCurso;

    public Curso() {
    }

    public Curso(int idCurso, String nombreCurso, String descripcionCurso, LocalDate fechaInicioCurso, LocalDate fechaFinCurso) {
        this.idCurso = idCurso;
        this.nombreCurso = nombreCurso;
        this.descripcionCurso = descripcionCurso;
        this.fechaInicioCurso = fechaInicioCurso;
        this.fechaFinCurso = fechaFinCurso;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getDescripcionCurso() {
        return descripcionCurso;
    }

    public void setDescripcionCurso(String descripcionCurso) {
        this.descripcionCurso = descripcionCurso;
    }

    public LocalDate getFechaInicioCurso() {
        return fechaInicioCurso;
    }

    public void setFechaInicioCurso(LocalDate fechaInicioCurso) {
        this.fechaInicioCurso = fechaInicioCurso;
    }

    public LocalDate getFechaFinCurso() {
        return fechaFinCurso;
    }

    public void setFechaFinCurso(LocalDate fechaFinCurso) {
        this.fechaFinCurso = fechaFinCurso;
    }
}
