package pe.edu.upc.aaw.beeorganizedproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "Encuesta")
public class Encuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEncuesta;
    @Column(name = "nombreEncuesta",nullable = false)
    private  String nombreEncuesta;
    @Column(name = "comentario",nullable = false,length = 120)
    private String comentario;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuarios usuario;
    public Encuesta() {
    }

    public Encuesta(int idEncuesta, String nombreEncuesta, String comentario, Usuarios usuario) {
        this.idEncuesta = idEncuesta;
        this.nombreEncuesta = nombreEncuesta;
        this.comentario = comentario;
        this.usuario = usuario;
    }

    public int getIdEncuesta() {
        return idEncuesta;
    }

    public void setIdEncuesta(int idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    public String getNombreEncuesta() {
        return nombreEncuesta;
    }

    public void setNombreEncuesta(String nombreEncuesta) {
        this.nombreEncuesta = nombreEncuesta;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
}
