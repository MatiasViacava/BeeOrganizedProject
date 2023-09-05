package pe.edu.upc.aaw.beeorganizedproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "Respuesta")
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRespuesta;
    @Column(name = "Contenido", length = 50 ,nullable = false)
    private String Contenido;

    @ManyToOne
    @JoinColumn(name = "idPregunta")
    private Pregunta Pregunta_Id;
    public Respuesta(){
    }

    public Respuesta(int idRespuesta, String contenido, Pregunta pregunta_Id) {
        this.idRespuesta = idRespuesta;
        Contenido = contenido;
        Pregunta_Id = pregunta_Id;
    }

    public int getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String contenido) {
        Contenido = contenido;
    }

    public Pregunta getPregunta_Id() {
        return Pregunta_Id;
    }

    public void setPregunta_Id(Pregunta pregunta_Id) {
        Pregunta_Id = pregunta_Id;
    }
}
