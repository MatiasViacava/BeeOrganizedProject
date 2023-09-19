package pe.edu.upc.aaw.beeorganizedproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "Encuesta")
public class Encuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEncuesta;
    @Column(name = "valoracionFinal",nullable = false,length = 45)
    private  int valoracionFinal;
    @Column(name = "Comentario",nullable = false,length = 120)
    private String Comentario;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuarios Usuario;
    public Encuesta() {
    }

    public Encuesta(int idEncuesta, int valoracionFinal, String comentario, Usuarios Usuario) {
        this.idEncuesta = idEncuesta;
        this.valoracionFinal = valoracionFinal;
        Comentario = comentario;
        this.Usuario = Usuario;
    }

    public int getIdEncuesta() {
        return idEncuesta;
    }

    public void setIdEncuesta(int idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    public int getValoracionFinal() {
        return valoracionFinal;
    }

    public void setValoracionFinal(int valoracionFinal) {
        this.valoracionFinal = valoracionFinal;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String comentario) {
        Comentario = comentario;
    }

    public Usuarios getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.Usuario = usuario;
    }
}
