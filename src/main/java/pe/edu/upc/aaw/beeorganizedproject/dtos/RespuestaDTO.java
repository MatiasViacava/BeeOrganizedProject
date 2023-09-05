package pe.edu.upc.aaw.beeorganizedproject.dtos;
import pe.edu.upc.aaw.beeorganizedproject.entities.Pregunta;
import pe.edu.upc.aaw.beeorganizedproject.entities.Respuesta;

public class RespuestaDTO {
    private int idRespuesta;
    private Pregunta Pregunta_Id;
    private String Contenido;

    public int getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public Pregunta getPregunta_Id() {
        return Pregunta_Id;
    }

    public void setPregunta_Id(Pregunta pregunta_Id) {
        Pregunta_Id = pregunta_Id;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String contenido) {
        Contenido = contenido;
    }
}
