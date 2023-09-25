package pe.edu.upc.aaw.beeorganizedproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "Configuracion")
public class Configuracion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConfiguracion;
    @Column(name = "ColorInterfaz", length = 50, nullable = false)
    private String ColorInterfaz;
    @ManyToOne
    @JoinColumn(name = "idIdioma")
    private Idioma idioma;
    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuarios Usuario;
    public Configuracion() {
    }

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

    public Usuarios getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.Usuario = usuario;
    }
}
