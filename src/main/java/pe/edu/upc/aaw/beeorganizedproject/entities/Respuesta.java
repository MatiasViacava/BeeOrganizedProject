package pe.edu.upc.aaw.beeorganizedproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "Respuesta")
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRespuesta;
    @Column(name = "Contenido", length = 50 ,nullable = false)
    private String contenido;

    @ManyToOne
    @JoinColumn(name = "idPregunta")
    private Pregunta pregunta_Id;
    public Respuesta(){
    }

    public Respuesta(int idRespuesta, String contenido, Pregunta pregunta_Id) {
        this.idRespuesta = idRespuesta;
        this.contenido = contenido;
        this.pregunta_Id = pregunta_Id;
    }

    public int getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Pregunta getPregunta_Id() {
        return pregunta_Id;
    }

    public void setPregunta_Id(Pregunta pregunta_Id) {
        this.pregunta_Id = pregunta_Id;
    }
}
