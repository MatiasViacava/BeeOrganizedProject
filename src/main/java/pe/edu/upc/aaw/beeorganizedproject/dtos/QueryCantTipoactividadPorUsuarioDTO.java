package pe.edu.upc.aaw.beeorganizedproject.dtos;

public class QueryCantTipoactividadPorUsuarioDTO {

    private String nombreUsuario;
    private int cantTipoactividadPorUsuarioDTO;

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getCantTipoactividadPorUsuarioDTO() {
        return cantTipoactividadPorUsuarioDTO;
    }

    public void setCantTipoactividadPorUsuarioDTO(int cantTipoactividadPorUsuarioDTO) {
        this.cantTipoactividadPorUsuarioDTO = cantTipoactividadPorUsuarioDTO;
    }
}
