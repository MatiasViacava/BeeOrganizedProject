package pe.edu.upc.aaw.beeorganizedproject.dtos;

import java.time.LocalDate;

public class CursoDTO {
    private int idCurso;
    private  String nombreCurso;
    private  String descripcionCurso;
    private LocalDate fechaInicioCurso;
    private LocalDate fechaFinCurso;

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
