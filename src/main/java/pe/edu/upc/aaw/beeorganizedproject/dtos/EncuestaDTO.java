package pe.edu.upc.aaw.beeorganizedproject.dtos;


import pe.edu.upc.aaw.beeorganizedproject.entities.Usuario;

public class EncuestaDTO {
    private int idEncuesta;
    private  int valoracionFinal;
    private String Comentario;
    private Usuario Usuario_Id;

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

    public Usuario getUsuario_Id() {
        return Usuario_Id;
    }

    public void setUsuario_Id(Usuario usuario_Id) {
        Usuario_Id = usuario_Id;
    }
}
