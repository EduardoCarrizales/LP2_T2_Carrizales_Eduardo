package pe.edu.cibertec.lp2_t2_Carrizales_Eduardo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.lp2_t2_Carrizales_Eduardo.model.OrdenCompra;
import java.util.List;

public interface OrdenCompraRepository extends JpaRepository<OrdenCompra, Integer> {
    List<OrdenCompra> findAllByOrderByNroOrdenDesc();
}
