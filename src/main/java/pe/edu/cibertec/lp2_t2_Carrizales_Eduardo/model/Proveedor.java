package pe.edu.cibertec.lp2_t2_Carrizales_Eduardo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_proveedor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProveedor;

    @Column(nullable = false, length = 100)
    private String razonSocial;

    @Column(nullable = false, length = 11)
    private String ruc;

    @Column(length = 100)
    private String rubro;

    @Column(length = 100)
    private String paginaWeb;
}
