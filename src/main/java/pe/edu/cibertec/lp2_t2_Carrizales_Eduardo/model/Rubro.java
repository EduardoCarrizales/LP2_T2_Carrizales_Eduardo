package pe.edu.cibertec.lp2_t2_Carrizales_Eduardo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_rubro")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Rubro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rubro")
    private Integer id;

    @Column(name = "denominacion", nullable = false, length = 50)
    private String denominacion;
}
