package pe.edu.upc.aaw.beeorganizedproject.dtos;

import pe.edu.upc.aaw.beeorganizedproject.entities.Idioma;
import pe.edu.upc.aaw.beeorganizedproject.entities.Usuario;

public class ConfiguracionDTO {
    private int idConfiguracion;
    private String ColorInterfaz;
    private Idioma idioma;
    private Usuario usuario;

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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
