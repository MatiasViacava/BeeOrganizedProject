package pe.edu.upc.aaw.beeorganizedproject.dtos;

import pe.edu.upc.aaw.beeorganizedproject.entities.Encuesta;

public class PreguntaDTO {
    private int idPregunta;
    private EncuestaDTO Encuesta_id;
    private String Enunciado;

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public EncuestaDTO getEncuesta_id() {
        return Encuesta_id;
    }

    public void setEncuesta_id(EncuestaDTO encuesta_id) {
        Encuesta_id = encuesta_id;
    }

    public String getEnunciado() {
        return Enunciado;
    }

    public void setEnunciado(String enunciado) {
        Enunciado = enunciado;
    }
}
