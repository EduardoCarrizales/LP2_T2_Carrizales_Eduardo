package pe.edu.cibertec.lp2_t2_Carrizales_Eduardo.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "tbl_proveedor")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proveedor")
    private Integer id;

    @Column(name = "ruc", nullable = false, length = 11)
    private String ruc;

    @Column(name = "razon_social", nullable = false, unique = true, length = 50)
    private String razonSocial;

    @Column(name = "fecha_registro", nullable = false)
    private LocalDate fechaRegistro;

    @Column(name = "direccion", nullable = false, length = 100)
    private String direccion;

    @Column(name = "pagina_web", length = 100)
    private String paginaWeb;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_rubro")
    private Rubro rubro;
}
