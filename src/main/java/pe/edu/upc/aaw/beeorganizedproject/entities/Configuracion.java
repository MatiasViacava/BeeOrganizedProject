package pe.edu.upc.aaw.beeorganizedproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "Configuracion")
public class Configuracion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConfiguracion;
    @Column(name = "colorInterfaz", length = 50, nullable = false)
    private String colorInterfaz;
    @ManyToOne
    @JoinColumn(name = "idIdioma")
    private Idioma idioma;
    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuarios usuario;
    public Configuracion() {
    }

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

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
}
