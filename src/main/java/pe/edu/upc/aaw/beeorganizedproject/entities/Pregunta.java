package pe.edu.upc.aaw.beeorganizedproject.entities;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table(name = "Pregunta")
public class Pregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPregunta;
    @Column(name = "Enunciado", length = 50,nullable = false)
    private String Enunciado;

    @ManyToOne
    @JoinColumn(name = "idEncuesta")
    private Encuesta Encuenta_id;
    public Pregunta(){

    }

    public Pregunta(int idPregunta, String enunciado, Encuesta encuenta_id) {
        this.idPregunta = idPregunta;
        Enunciado = enunciado;
        Encuenta_id = encuenta_id;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getEnunciado() {
        return Enunciado;
    }

    public void setEnunciado(String enunciado) {
        Enunciado = enunciado;
    }

    public Encuesta getEncuenta_id() {
        return Encuenta_id;
    }

    public void setEncuenta_id(Encuesta encuenta_id) {
        Encuenta_id = encuenta_id;
    }
}
