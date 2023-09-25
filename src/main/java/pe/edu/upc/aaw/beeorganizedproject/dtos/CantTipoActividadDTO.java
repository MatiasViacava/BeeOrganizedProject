package pe.edu.upc.aaw.beeorganizedproject.dtos;

public class CantTipoActividadDTO {
    private String Tipo_Actividad;
    private int Cantidad;

    public String getTipo_Actividad() {
        return Tipo_Actividad;
    }

    public void setTipo_Actividad(String tipo_Actividad) {
        Tipo_Actividad = tipo_Actividad;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }
}
