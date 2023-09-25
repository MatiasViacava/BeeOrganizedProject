package pe.edu.upc.aaw.beeorganizedproject.dtos;

public class TiposUsuarioDTO {
    private int idTipoUsuario;
    private String NombreTipoUsuario;
    private UsuarioDTO usuarios;

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getNombreTipoUsuario() {
        return NombreTipoUsuario;
    }

    public void setNombreTipoUsuario(String NombreTipoUsuario) {
        this.NombreTipoUsuario = NombreTipoUsuario;
    }

    public UsuarioDTO getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(UsuarioDTO usuarios) {
        this.usuarios = usuarios;
    }
}
