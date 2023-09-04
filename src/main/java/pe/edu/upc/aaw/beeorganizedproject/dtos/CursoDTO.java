package pe.edu.upc.aaw.beeorganizedproject.dtos;

import java.time.LocalDate;

public class CursoDTO {
    private int idCurso;
    private  String NombreCurso;
    private  String DescripcionCurso;
    private LocalDate FechaInicioCurso;
    private LocalDate FechaFinCurso;
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
