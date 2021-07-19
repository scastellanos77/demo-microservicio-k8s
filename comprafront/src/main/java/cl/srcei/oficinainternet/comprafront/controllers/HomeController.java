// Programa: HomeController.java
// Descripcion:
// Autor: simon.castellanos@zeke.cl


package cl.srcei.oficinainternet.comprafront.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.srcei.oficinainternet.comprafront.services.ProductoService;

@Controller
public class HomeController {

    @Autowired
    private ProductoService productoService;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("productos", productoService.getProductos());
        return "index";
    }
}
