package pe.edu.upc.aaw.beeorganizedproject.dtos;

import pe.edu.upc.aaw.beeorganizedproject.entities.DatosUsuario;

import java.time.LocalDate;

public class HorarioDTO {
    private int idHorario;
    private LocalDate CierreCiclo;
    private DatosUsuario datosUsuario;

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public LocalDate getCierreCiclo() {
        return CierreCiclo;
    }

    public void setCierreCiclo(LocalDate cierreCiclo) {
        CierreCiclo = cierreCiclo;
    }

    public DatosUsuario getUsuario() {
        return datosUsuario;
    }

    public void setUsuario(DatosUsuario datosUsuario) {
        this.datosUsuario = datosUsuario;
    }
}
