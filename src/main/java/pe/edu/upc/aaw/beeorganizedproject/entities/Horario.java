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
    @JoinColumn(name = "usuario_id")
    private Usuarios Usuario;
    public Horario(){

    }
    public Horario(int idHorario, LocalDate cierreCiclo, Usuarios usuario) {
        this.idHorario = idHorario;
        CierreCiclo = cierreCiclo;
        this.Usuario = usuario;
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

    public Usuarios getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.Usuario = usuario;
    }
}
