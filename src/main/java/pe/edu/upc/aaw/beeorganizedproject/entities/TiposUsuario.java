package pe.edu.upc.aaw.beeorganizedproject.entities;
import javax.persistence.*;

@Entity
@Table(name = "tipos_usuario", uniqueConstraints = { @UniqueConstraint(columnNames = { "usuario_id", "tipo_usuario" }) })
public class TiposUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoUsuario;
    @Column(name = "tipo_usuario",nullable = false, length = 45)
    private String NombreTipoUsuario;

    @ManyToOne
    @JoinColumn(name="usuario_id", nullable=false)
    private Usuarios usuarios;

    public TiposUsuario() {
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getNombreTipoUsuario() {
        return NombreTipoUsuario;
    }

    public void setNombreTipoUsuario(String NombreTipoUsuario) {
        this.NombreTipoUsuario = NombreTipoUsuario;
    }
}
