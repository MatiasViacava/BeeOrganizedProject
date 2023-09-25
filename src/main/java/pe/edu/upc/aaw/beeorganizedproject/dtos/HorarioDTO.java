package pe.edu.upc.aaw.beeorganizedproject.dtos;


import java.time.LocalDate;

public class HorarioDTO {
    private int idHorario;
    private LocalDate CierreCiclo;
    private UsuarioDTO Usuario;

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

    public UsuarioDTO getUsuario() {
        return Usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.Usuario = usuario;
    }
}
