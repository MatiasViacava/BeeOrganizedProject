package pe.edu.upc.aaw.beeorganizedproject.dtos;

import java.time.LocalDate;

public class CantActividadesIntervaloDTO {
    private LocalDate fechainicio;
    private LocalDate fechafin;

    public LocalDate getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(LocalDate fechainicio) {
        this.fechainicio = fechainicio;
    }

    public LocalDate getFechafin() {
        return fechafin;
    }

    public void setFechafin(LocalDate fechafin) {
        this.fechafin = fechafin;
    }
}
