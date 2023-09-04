package pe.edu.upc.aaw.beeorganizedproject.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Horario")
public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHorario;
    @Column(name = "CierreCiclo", nullable = false)
    private LocalDate CierreCiclo;
    @OneToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Horario(){

    }
    public Horario(int idHorario, LocalDate cierreCiclo, Usuario usuario) {
        this.idHorario = idHorario;
        CierreCiclo = cierreCiclo;
        this.usuario = usuario;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public LocalDate getCierreCiclo() {
        return CierreCiclo;
    }

    public void setCierreCiclo(LocalDate cierreCiclo) {
        CierreCiclo = cierreCiclo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
