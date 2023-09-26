package pe.edu.upc.aaw.beeorganizedproject.dtos;

public class TipoRecursoDTO {
    private int ID;
    private String NombreTipo;

    public int getID() {return ID;}
    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombreTipo() {
        return NombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        NombreTipo = nombreTipo;
    }
}
