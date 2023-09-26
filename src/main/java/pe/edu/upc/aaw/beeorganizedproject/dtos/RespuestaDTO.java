package pe.edu.upc.aaw.beeorganizedproject.dtos;

public class RespuestaDTO {
    private int idRespuesta;
    private PreguntaDTO Pregunta_Id;
    private String Contenido;

    public int getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public PreguntaDTO getPregunta_Id() {
        return Pregunta_Id;
    }

    public void setPregunta_Id(PreguntaDTO pregunta_Id) {
        Pregunta_Id = pregunta_Id;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String contenido) {
        Contenido = contenido;
    }
}
