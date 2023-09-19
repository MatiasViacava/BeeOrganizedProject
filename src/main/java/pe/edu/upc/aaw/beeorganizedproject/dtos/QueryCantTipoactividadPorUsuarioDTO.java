package pe.edu.upc.aaw.beeorganizedproject.dtos;

public class QueryCantTipoactividadPorUsuarioDTO {

    private String NombreUsuario;
    private int CantTipoactividadPorUsuarioDTO;
    public int getCantTipoactividadPorUsuarioDTO() {
        return CantTipoactividadPorUsuarioDTO;
    }
    public void setCantTipoactividadPorUsuarioDTO(int cantTipoactividadPorUsuarioDTO) {
        CantTipoactividadPorUsuarioDTO = cantTipoactividadPorUsuarioDTO;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        NombreUsuario = nombreUsuario;
    }
}
