package pe.edu.upc.aaw.beeorganizedproject.dtos;



public class EncuestaDTO {
    private int idEncuesta;
    private  int valoracionFinal;
    private String Comentario;
    private UsuarioDTO Usuario;

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

    public UsuarioDTO getUsuario() {
        return Usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.Usuario = usuario;
    }
}
