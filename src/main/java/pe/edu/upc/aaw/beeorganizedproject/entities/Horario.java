package pe.edu.upc.aaw.beeorganizedproject.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Horario")
public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHorario;
    @Column(name = "cierreCiclo", nullable = false)
    private LocalDate cierreCiclo;
    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuarios usuario;
    public Horario(){

    }

    public Horario(int idHorario, LocalDate cierreCiclo, Usuarios usuario) {
        this.idHorario = idHorario;
        this.cierreCiclo = cierreCiclo;
        this.usuario = usuario;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public LocalDate getCierreCiclo() {
        return cierreCiclo;
    }

    public void setCierreCiclo(LocalDate cierreCiclo) {
        this.cierreCiclo = cierreCiclo;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
}
