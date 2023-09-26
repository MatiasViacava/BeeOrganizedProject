package pe.edu.upc.aaw.beeorganizedproject.dtos;

import java.time.LocalDate;

public class ActividadDTO {
    private int idActividad;
    private String NombreActividad;
    private String Descripcion;
    private String Estado;
    private int Calificacion;
    private LocalDate Fecha;
    private HorarioDTO horario;
    private TipoActividadDTO tipoActividad;
    private CursoDTO curso;

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

    public HorarioDTO getHorario() {
        return horario;
    }

    public void setHorario(HorarioDTO horario) {
        this.horario = horario;
    }

    public TipoActividadDTO getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(TipoActividadDTO tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    public CursoDTO getCurso() {
        return curso;
    }

    public void setCurso(CursoDTO curso) {
        this.curso = curso;
    }
}
