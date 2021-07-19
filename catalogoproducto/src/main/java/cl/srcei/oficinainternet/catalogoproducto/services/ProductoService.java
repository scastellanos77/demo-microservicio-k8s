// Programa: ProductoService.java
// Descripcion:
// Autor: simon.castellanos@zeke.cl


package cl.srcei.oficinainternet.catalogoproducto.services;

import cl.srcei.oficinainternet.catalogoproducto.model.Producto;

import java.math.BigDecimal;
import java.util.*;

public class ProductoService {

    //{productoId, Producto}
    private Map<String, Producto> fakeProductoDAO = new HashMap<>();

    public ProductoService() {
        fakeProductoDAO.put("1", new Producto("1", "Certificado"1, "---Item 1", new BigDecimal(1.20)));
        fakeProductoDAO.put("2", new Producto("2", "Certificado 2", "--Item 2", new BigDecimal(4.10)));
        fakeProductoDAO.put("3", new Producto("3", "Certificado 3", "---Item 3", new BigDecimal(45.50)));
        fakeProductoDAO.put("4", new Producto("4", "Certificado 4", "---Item 4", new BigDecimal(1.80)));
        fakeProductoDAO.put("5", new Producto("5", "Certificado 5", "--Item 5", new BigDecimal(154.10)));
    }

    public List<Producto> getAllProductos() {
        return new ArrayList<>(fakeProductoDAO.values());
    }

    public Optional<Producto> getProducto(String id) {
        return Optional.ofNullable(fakeProductoDAO.get(id));
    }
}
