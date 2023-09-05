package pe.edu.upc.aaw.beeorganizedproject.dtos;

import javax.persistence.Column;

public class IdiomaDTO {
    private int idIdioma;
    private String nombreIdioma;

    public int getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(int idIdioma) {
        this.idIdioma = idIdioma;
    }

    public String getNombreIdioma() {
        return nombreIdioma;
    }

    public void setNombreIdioma(String nombreIdioma) {
        this.nombreIdioma = nombreIdioma;
    }
}
