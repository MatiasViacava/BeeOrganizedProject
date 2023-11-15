package pe.edu.upc.aaw.beeorganizedproject.dtos;


import java.time.LocalDate;

public class HorarioDTO {
    private int idHorario;
    private LocalDate cierreCiclo;
    private UsuarioDTO usuario;

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public LocalDate getCierreCiclo() {
        return cierreCiclo;
    }

    public void setCierreCiclo(LocalDate cierreCiclo) {
        this.cierreCiclo = cierreCiclo;
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }
}
