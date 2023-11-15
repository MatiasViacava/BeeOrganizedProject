package pe.edu.upc.aaw.beeorganizedproject.dtos;

public class TipoActividadDTO {
    private int iDTipoActividad;
    private String nombreTipoActividad;

    public int getiDTipoActividad() {
        return iDTipoActividad;
    }

    public void setiDTipoActividad(int iDTipoActividad) {
        this.iDTipoActividad = iDTipoActividad;
    }

    public String getNombreTipoActividad() {
        return nombreTipoActividad;
    }

    public void setNombreTipoActividad(String nombreTipoActividad) {
        this.nombreTipoActividad = nombreTipoActividad;
    }
}
