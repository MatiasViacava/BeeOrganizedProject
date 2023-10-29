package pe.edu.upc.aaw.beeorganizedproject.dtos;

public class ConfiguracionDTO {
    private int idConfiguracion;
    private String colorInterfaz;
    private IdiomaDTO idioma;
    private UsuarioDTO usuario;

    public int getIdConfiguracion() {
        return idConfiguracion;
    }

    public void setIdConfiguracion(int idConfiguracion) {
        this.idConfiguracion = idConfiguracion;
    }

    public String getColorInterfaz() {
        return colorInterfaz;
    }

    public void setColorInterfaz(String colorInterfaz) {
        this.colorInterfaz = colorInterfaz;
    }

    public IdiomaDTO getIdioma() {
        return idioma;
    }

    public void setIdioma(IdiomaDTO idioma) {
        this.idioma = idioma;
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }
}
