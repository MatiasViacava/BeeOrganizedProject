package pe.edu.upc.aaw.beeorganizedproject.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCurso;
    @Column(name = "NombreCurso",nullable = false,length = 45)
    private  String NombreCurso;
    @Column(name = "DescripcionCurso",nullable = false,length = 45)
    private  String DescripcionCurso;
    @Column(name = "FechaInicioCurso",nullable = false)
    private LocalDate FechaInicioCurso;
    @Column(name = "FechaFinCurso",nullable = false)
    private LocalDate FechaFinCurso;

    public Curso() {
    }

    public Curso(int idCurso, String nombreCurso, String descripcionCurso, LocalDate fechaInicioCurso, LocalDate fechaFinCurso) {
        this.idCurso = idCurso;
        this.NombreCurso = nombreCurso;
        this.DescripcionCurso = descripcionCurso;
        this.FechaInicioCurso = fechaInicioCurso;
        this.FechaFinCurso = fechaFinCurso;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return NombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        NombreCurso = nombreCurso;
    }

    public String getDescripcionCurso() {
        return DescripcionCurso;
    }

    public void setDescripcionCurso(String descripcionCurso) {
        DescripcionCurso = descripcionCurso;
    }

    public LocalDate getFechaInicioCurso() {
        return FechaInicioCurso;
    }

    public void setFechaInicioCurso(LocalDate fechaInicioCurso) {
        FechaInicioCurso = fechaInicioCurso;
    }

    public LocalDate getFechaFinCurso() {
        return FechaFinCurso;
    }

    public void setFechaFinCurso(LocalDate fechaFinCurso) {
        FechaFinCurso = fechaFinCurso;
    }
}
