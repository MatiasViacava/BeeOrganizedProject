package pe.edu.upc.aaw.beeorganizedproject.dtos;

public class QueryCantRecursosPorTipoDTO {
    private String nombreTipoRecurso;
    private int cantRecursos;

    public String getNombreTipoRecurso() {
        return nombreTipoRecurso;
    }

    public void setNombreTipoRecurso(String nombreTipoRecurso) {
        this.nombreTipoRecurso = nombreTipoRecurso;
    }

    public int getCantRecursos() {
        return cantRecursos;
    }

    public void setCantRecursos(int cantRecursos) {
        this.cantRecursos = cantRecursos;
    }
}
