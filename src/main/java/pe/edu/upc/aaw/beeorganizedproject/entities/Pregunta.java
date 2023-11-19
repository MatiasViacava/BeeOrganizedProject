package pe.edu.upc.aaw.beeorganizedproject.entities;


import javax.persistence.*;

@Entity
@Table(name = "Pregunta")
public class Pregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPregunta;
    @Column(name = "enunciado", length = 100,nullable = false)
    private String enunciado;

    @ManyToOne
    @JoinColumn(name = "idEncuesta")
    private Encuesta encuesta_id;
    public Pregunta(){

    }

    public Pregunta(int idPregunta, String enunciado, Encuesta encuesta_id) {
        this.idPregunta = idPregunta;
        this.enunciado = enunciado;
        this.encuesta_id = encuesta_id;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public Encuesta getEncuesta_id() {
        return encuesta_id;
    }

    public void setEncuesta_id(Encuesta encuesta_id) {
        this.encuesta_id = encuesta_id;
    }
}
