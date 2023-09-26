package pe.edu.upc.aaw.beeorganizedproject.dtos;

import java.util.Date;

public class RecursoAcademicoDTO {
    private int ID;

    private String EnlaceRecurso;

    private String NombreRecurso;

    private String Autor;

    private String Descripcion;

    private Date FechaPublicacion;

    private TipoRecursoDTO tipoRecurso_ID;

    private CursoDTO curso_IdCurso;

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
