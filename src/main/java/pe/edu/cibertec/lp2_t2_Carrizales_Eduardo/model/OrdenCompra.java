package pe.edu.cibertec.lp2_t2_Carrizales_Eduardo.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "tbl_orden_compra")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrdenCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer nroOrden;

    @Column(nullable = false)
    private LocalDate fechaEntrega;

    @Column(nullable = false, length = 150)
    private String direccionEntrega;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idProveedor", nullable = false)
    private Proveedor proveedor;

    @Column(nullable = false)
    private Double monto;

    @Column(nullable = false, length = 1)
    private String estado;
}
