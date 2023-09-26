package pe.edu.upc.aaw.beeorganizedproject.dtos;

public class ConfiguracionDTO {
    private int idConfiguracion;
    private String ColorInterfaz;
    private IdiomaDTO idioma;
    private UsuarioDTO Usuario;

    public int getIdConfiguracion() {
        return idConfiguracion;
    }

    public void setIdConfiguracion(int idConfiguracion) {
        this.idConfiguracion = idConfiguracion;
    }

    public String getColorInterfaz() {
        return ColorInterfaz;
    }

    public void setColorInterfaz(String colorInterfaz) {
        ColorInterfaz = colorInterfaz;
    }

    public IdiomaDTO getIdioma() {
        return idioma;
    }

    public void setIdioma(IdiomaDTO idioma) {
        this.idioma = idioma;
    }

    public UsuarioDTO getUsuario() {
        return Usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.Usuario = usuario;
    }
}
