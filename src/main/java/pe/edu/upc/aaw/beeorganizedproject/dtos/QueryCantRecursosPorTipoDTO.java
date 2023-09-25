package pe.edu.upc.aaw.beeorganizedproject.dtos;

public class QueryCantRecursosPorTipoDTO {
    private String NombreTipoRecurso;
    private int CantRecursos;
    public String getNombreTipoRecurso() {
        return NombreTipoRecurso;
    }

    public void setNombreTipoRecurso(String nombreTipoRecurso) {
        NombreTipoRecurso = nombreTipoRecurso;
    }

    public int getCantRecursos() {
        return CantRecursos;
    }

    public void setCantRecursos(int cantRecursos) {
        CantRecursos = cantRecursos;
    }
}
