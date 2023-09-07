package pe.edu.upc.aaw.beeorganizedproject.dtos;

import pe.edu.upc.aaw.beeorganizedproject.entities.Idioma;
import pe.edu.upc.aaw.beeorganizedproject.entities.DatosUsuario;

public class ConfiguracionDTO {
    private int idConfiguracion;
    private String ColorInterfaz;
    private Idioma idioma;
    private DatosUsuario datosUsuario;

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

    public DatosUsuario getUsuario() {
        return datosUsuario;
    }

    public void setUsuario(DatosUsuario datosUsuario) {
        this.datosUsuario = datosUsuario;
    }
}
