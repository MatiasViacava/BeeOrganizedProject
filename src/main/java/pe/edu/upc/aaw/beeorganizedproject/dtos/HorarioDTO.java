package pe.edu.upc.aaw.beeorganizedproject.dtos;

import pe.edu.upc.aaw.beeorganizedproject.entities.Usuarios;

import java.time.LocalDate;

public class HorarioDTO {
    private int idHorario;
    private LocalDate CierreCiclo;
    private Usuarios Usuario;

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

    public Usuarios getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.Usuario = usuario;
    }
}
