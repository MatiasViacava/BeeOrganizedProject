package pe.edu.upc.aaw.beeorganizedproject.dtos;

public class RespuestaDTO {
    private int idRespuesta;
    private PreguntaDTO pregunta_Id;
    private String contenido;

    public int getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public PreguntaDTO getPregunta_Id() {
        return pregunta_Id;
    }

    public void setPregunta_Id(PreguntaDTO pregunta_Id) {
        this.pregunta_Id = pregunta_Id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
