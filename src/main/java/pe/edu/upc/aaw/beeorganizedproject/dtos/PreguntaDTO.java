package pe.edu.upc.aaw.beeorganizedproject.dtos;

import pe.edu.upc.aaw.beeorganizedproject.entities.Encuesta;

import javax.persistence.Column;

public class PreguntaDTO {
    private int idPregunta;
    private Encuesta Encuenta_id;
    private String Enunciado;

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public Encuesta getEncuenta_id() {
        return Encuenta_id;
    }

    public void setEncuenta_id(Encuesta encuenta_id) {
        Encuenta_id = encuenta_id;
    }

    public String getEnunciado() {
        return Enunciado;
    }

    public void setEnunciado(String enunciado) {
        Enunciado = enunciado;
    }
}
