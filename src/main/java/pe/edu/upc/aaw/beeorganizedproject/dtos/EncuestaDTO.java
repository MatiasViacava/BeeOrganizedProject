package pe.edu.upc.aaw.beeorganizedproject.dtos;


import pe.edu.upc.aaw.beeorganizedproject.entities.DatosUsuario;

public class EncuestaDTO {
    private int idEncuesta;
    private  int valoracionFinal;
    private String Comentario;
    private DatosUsuario datosUsuario_Id;

    public int getIdEncuesta() {
        return idEncuesta;
    }

    public void setIdEncuesta(int idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    public int getValoracionFinal() {
        return valoracionFinal;
    }

    public void setValoracionFinal(int valoracionFinal) {
        this.valoracionFinal = valoracionFinal;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String comentario) {
        Comentario = comentario;
    }

    public DatosUsuario getUsuario_Id() {
        return datosUsuario_Id;
    }

    public void setUsuario_Id(DatosUsuario datosUsuario_Id) {
        this.datosUsuario_Id = datosUsuario_Id;
    }
}
