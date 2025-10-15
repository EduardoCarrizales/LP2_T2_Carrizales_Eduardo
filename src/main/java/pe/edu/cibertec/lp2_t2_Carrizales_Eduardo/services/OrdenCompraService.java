package pe.edu.cibertec.lp2_t2_Carrizales_Eduardo.services;

import pe.edu.cibertec.lp2_t2_Carrizales_Eduardo.model.OrdenCompra;
import java.util.List;

public interface OrdenCompraService {
    List<OrdenCompra> listarDesc();
    OrdenCompra guardar(OrdenCompra orden);
    OrdenCompra obtener(Integer id);
}
