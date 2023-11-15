package pe.edu.upc.aaw.beeorganizedproject.entities;

import javax.persistence.*;

@Entity
@Table(name="TipoRecurso")
public class TipoRecurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int iD;

    @Column(name = "nombreTipo",nullable = false,length = 60)
    private String nombreTipo;
    public TipoRecurso(){

    }

    public TipoRecurso(int iD, String nombreTipo) {
        this.iD = iD;
        this.nombreTipo = nombreTipo;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }
}
