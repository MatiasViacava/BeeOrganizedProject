package pe.edu.upc.aaw.beeorganizedproject.dtos;

import java.time.LocalDate;

public class RecursoAcademicoDTO {
    private int iD;

    private String enlaceRecurso;

    private String nombreRecurso;

    private String autor;

    private String descripcion;

    private LocalDate fechaPublicacion;

    private TipoRecursoDTO tipoRecurso_ID;

    private CursoDTO curso_IdCurso;

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

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public TipoRecursoDTO getTipoRecurso_ID() {
        return tipoRecurso_ID;
    }

    public void setTipoRecurso_ID(TipoRecursoDTO tipoRecurso_ID) {
        this.tipoRecurso_ID = tipoRecurso_ID;
    }

    public CursoDTO getCurso_IdCurso() {
        return curso_IdCurso;
    }

    public void setCurso_IdCurso(CursoDTO curso_IdCurso) {
        this.curso_IdCurso = curso_IdCurso;
    }
}
