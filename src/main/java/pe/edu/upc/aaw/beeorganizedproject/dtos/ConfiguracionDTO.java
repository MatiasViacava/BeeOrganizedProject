package pe.edu.upc.aaw.beeorganizedproject.dtos;

import pe.edu.upc.aaw.beeorganizedproject.entities.Idioma;

public class ConfiguracionDTO {
    private int idConfiguracion;
    private String ColorInterfaz;
    private Idioma idioma;
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

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public UsuarioDTO getUsuario() {
        return Usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.Usuario = usuario;
    }
}
