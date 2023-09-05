package pe.edu.upc.aaw.beeorganizedproject.entities;

import javax.persistence.*;

@Entity
@Table(name="Idioma")
public class Idioma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIdioma;
    @Column(name = "nombreIdioma", nullable = false, length = 45)
    private String nombreIdioma;



    public Idioma(){}

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
