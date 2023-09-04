package pe.edu.upc.aaw.beeorganizedproject.dtos;

public class TipoActividadDTO {
    private int IDTipoActividad;
    private String NombreTipoActividad;

    public int getIDTipoActividad() {
        return IDTipoActividad;
    }

    public void setIDTipoActividad(int IDTipoActividad) {
        this.IDTipoActividad = IDTipoActividad;
    }

    public String getNombreTipoActividad() {
        return NombreTipoActividad;
    }

    public void setNombreTipoActividad(String nombreTipoActividad) {
        NombreTipoActividad = nombreTipoActividad;
    }
}
