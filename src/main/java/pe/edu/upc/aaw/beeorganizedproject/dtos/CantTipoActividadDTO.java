package pe.edu.upc.aaw.beeorganizedproject.dtos;

public class CantTipoActividadDTO {
    private String tipo_Actividad;
    private int cantidad;

    public String getTipo_Actividad() {
        return tipo_Actividad;
    }

    public void setTipo_Actividad(String tipo_Actividad) {
        this.tipo_Actividad = tipo_Actividad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
