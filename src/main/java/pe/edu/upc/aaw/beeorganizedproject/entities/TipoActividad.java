package pe.edu.upc.aaw.beeorganizedproject.entities;

import javax.persistence.*;

@Entity
@Table(name="TipoActividad")
public class TipoActividad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDTipoActividad;

    @Column(name = "NombreTipoActividad",nullable = false,length = 60)
    private String NombreTipoActividad;

    public TipoActividad(){
    }

    public TipoActividad(int IDTipoActividad, String nombreTipoActividad) {
        this.IDTipoActividad = IDTipoActividad;
        NombreTipoActividad = nombreTipoActividad;
    }

    public int getIDTipoActividad() {
        return IDTipoActividad;
    }

    public void setIDTipoActividad(int IDTipoActividad) {
        this.IDTipoActividad = IDTipoActividad;
    }

    public String getNombreTipoActividad() {
        return NombreTipoActividad;
    }

    public void setNombreTipoActividad(String nombreTipoActividad) {
        NombreTipoActividad = nombreTipoActividad;
    }
}
