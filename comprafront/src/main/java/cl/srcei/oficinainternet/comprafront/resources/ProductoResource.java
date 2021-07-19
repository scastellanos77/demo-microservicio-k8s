// Programa: ProductoResource.java
// Descripcion:
// Autor: simon.castellanos@zeke.cl

package cl.srcei.oficinainternet.comprafront.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.srcei.oficinainternet.comprafront.model.Producto;
import cl.srcei.oficinainternet.comprafront.services.ProductoService;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoResource {

    @Autowired
    private ProductoService productoService;

    @RequestMapping()
    public List<Producto> getProductos() {
        return productoService.getProductos();

    }
}
