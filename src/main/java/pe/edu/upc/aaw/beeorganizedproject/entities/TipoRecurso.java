package pe.edu.upc.aaw.beeorganizedproject.entities;

import javax.persistence.*;

@Entity
@Table(name="TipoRecurso")
public class TipoRecurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(name = "NombreTipo",nullable = false,length = 60)
    private String NombreTipo;
    public TipoRecurso(){

    }

    public TipoRecurso(int ID, String nombreTipo) {
        this.ID = ID;
        NombreTipo = nombreTipo;
    }

    public int getID() {
        return ID;
    }

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
