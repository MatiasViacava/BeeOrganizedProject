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
    @JoinColumn(name = "idUsuario")
        private DatosUsuario datosUsuario_Id;
    public Encuesta() {
    }

    public Encuesta(int idEncuesta, int valoracionFinal, String comentario, DatosUsuario datosUsuario_Id) {
        this.idEncuesta = idEncuesta;
        this.valoracionFinal = valoracionFinal;
        Comentario = comentario;
        this.datosUsuario_Id = datosUsuario_Id;
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

    public DatosUsuario getUsuario_Id() {
        return datosUsuario_Id;
    }

    public void setUsuario_Id(DatosUsuario datosUsuario_Id) {
        this.datosUsuario_Id = datosUsuario_Id;
    }
}
