package pe.edu.cibertec.lp2_t2_Carrizales_Eduardo.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.lp2_t2_Carrizales_Eduardo.model.OrdenCompra;
import pe.edu.cibertec.lp2_t2_Carrizales_Eduardo.repository.OrdenCompraRepository;
import pe.edu.cibertec.lp2_t2_Carrizales_Eduardo.services.OrdenCompraService;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class OrdenCompraServiceImpl implements OrdenCompraService {

    private final OrdenCompraRepository repo;

    @Override
    public List<OrdenCompra> listarDesc() {
        return repo.findAllByOrderByNroOrdenDesc();
    }

    @Override
    public OrdenCompra guardar(OrdenCompra orden) {
        return repo.save(orden);
    }

    @Override
    public OrdenCompra obtener(Integer id) {
        return repo.findById(id).orElseThrow();
    }
}
