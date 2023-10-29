package pe.edu.upc.aaw.beeorganizedproject.dtos;

public class PreguntaDTO {
    private int idPregunta;
    private EncuestaDTO encuesta_id;
    private String enunciado;

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public EncuestaDTO getEncuesta_id() {
        return encuesta_id;
    }

    public void setEncuesta_id(EncuestaDTO encuesta_id) {
        this.encuesta_id = encuesta_id;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
}
