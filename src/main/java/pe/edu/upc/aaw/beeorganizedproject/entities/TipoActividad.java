package pe.edu.upc.aaw.beeorganizedproject.entities;

import javax.persistence.*;

@Entity
@Table(name="TipoActividad")
public class TipoActividad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int iDTipoActividad;

    @Column(name = "nombreTipoActividad",nullable = false,length = 60)
    private String nombreTipoActividad;

    public TipoActividad(){
    }

    public TipoActividad(int iDTipoActividad, String nombreTipoActividad) {
        this.iDTipoActividad = iDTipoActividad;
        this.nombreTipoActividad = nombreTipoActividad;
    }

    public int getiDTipoActividad() {
        return iDTipoActividad;
    }

    public void setiDTipoActividad(int iDTipoActividad) {
        this.iDTipoActividad = iDTipoActividad;
    }

    public String getNombreTipoActividad() {
        return nombreTipoActividad;
    }

    public void setNombreTipoActividad(String nombreTipoActividad) {
        this.nombreTipoActividad = nombreTipoActividad;
    }
}
