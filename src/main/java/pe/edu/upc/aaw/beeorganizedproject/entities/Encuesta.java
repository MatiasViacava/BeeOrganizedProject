package pe.edu.upc.aaw.beeorganizedproject.entities;

import javax.persistence.*;
import java.time.LocalDate;

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
    @JoinColumn(name = "idUsuario")
        private Usuario Usuario_Id;
    public Encuesta() {
    }

    public Encuesta(int idEncuesta, int valoracionFinal, String comentario, Usuario usuario_Id) {
        this.idEncuesta = idEncuesta;
        this.valoracionFinal = valoracionFinal;
        Comentario = comentario;
        Usuario_Id = usuario_Id;
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

    public Usuario getUsuario_Id() {
        return Usuario_Id;
    }

    public void setUsuario_Id(Usuario usuario_Id) {
        Usuario_Id = usuario_Id;
    }
}
