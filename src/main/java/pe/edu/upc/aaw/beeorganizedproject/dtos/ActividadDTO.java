package pe.edu.upc.aaw.beeorganizedproject.dtos;

import java.time.LocalDate;

public class ActividadDTO {
    private int idActividad;
    private String nombreActividad;
    private String descripcion;
    private String estado;
    private int calificacion;
    private LocalDate fecha;
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
