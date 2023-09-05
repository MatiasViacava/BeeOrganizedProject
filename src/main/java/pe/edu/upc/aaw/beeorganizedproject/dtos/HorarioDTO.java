package pe.edu.upc.aaw.beeorganizedproject.dtos;

import pe.edu.upc.aaw.beeorganizedproject.entities.Usuario;

import java.time.LocalDate;

public class HorarioDTO {
    private int idHorario;
    private LocalDate CierreCiclo;
    private Usuario usuario;

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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
