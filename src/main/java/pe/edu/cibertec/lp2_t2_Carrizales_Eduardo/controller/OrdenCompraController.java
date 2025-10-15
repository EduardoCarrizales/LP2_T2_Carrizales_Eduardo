package pe.edu.cibertec.lp2_t2_Carrizales_Eduardo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pe.edu.cibertec.lp2_t2_Carrizales_Eduardo.model.OrdenCompra;
import pe.edu.cibertec.lp2_t2_Carrizales_Eduardo.repository.ProveedorRepository;
import pe.edu.cibertec.lp2_t2_Carrizales_Eduardo.services.OrdenCompraService;

@Controller
@RequestMapping("/ordenes")
@RequiredArgsConstructor
public class OrdenCompraController {

    private final OrdenCompraService service;
    private final ProveedorRepository proveedorRepo;

    @GetMapping
    public String listado(Model model) {
        model.addAttribute("ordenes", service.listarDesc());
        return "listado";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("orden", new OrdenCompra());
        model.addAttribute("proveedores", proveedorRepo.findAll());
        return "nuevo";
    }

    @PostMapping("/registrar")
    public String registrar(OrdenCompra orden, RedirectAttributes ra) {
        OrdenCompra o = service.guardar(orden);
        ra.addFlashAttribute("msg", "Orden de compra nro. " + o.getNroOrden() + " registrada");
        return "redirect:/ordenes";
    }

    @GetMapping("/{id}/editar")
    public String editar(@PathVariable Integer id, Model model) {
        model.addAttribute("orden", service.obtener(id));
        model.addAttribute("proveedores", proveedorRepo.findAll());
        return "edicion";
    }

    @PostMapping("/{id}/guardar")
    public String guardar(@PathVariable Integer id, OrdenCompra orden, RedirectAttributes ra) {
        orden.setNroOrden(id);
        OrdenCompra o = service.guardar(orden);
        ra.addFlashAttribute("msg", "Orden de compra nro. " + o.getNroOrden() + " actualizada");
        return "redirect:/ordenes";
    }
}
