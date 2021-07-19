// Programa: ProductoService.java
// Descripcion:
// Autor: simon.castellanos@zeke.cl

package cl.srcei.oficinainternet.comprafront.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.srcei.oficinainternet.comprafront.model.Producto;
import cl.srcei.oficinainternet.comprafront.repo.StockRepo;
import cl.srcei.oficinainternet.comprafront.repo.ProductoRepo;
import cl.srcei.oficinainternet.comprafront.services.dto.ProductoDTO;
import cl.srcei.oficinainternet.comprafront.services.dto.StockDTO;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ProductoService {

    @Autowired
    private StockRepo stockRepo;

    @Autowired
    private ProductoRepo productoRepo;


    public List<Producto> getProductos() {
        Map<String, ProductoDTO> productoDTOs = productoRepo.getProductoDTOs();
        Map<String, StockDTO> stockDTOMap = stockRepo.getStockDTOs();

        // Merge productDTOs and stockDTOs to a List of Products
        return productoDTOs.values().stream()
                .map(productoDTO -> {
                    StockDTO stockDTO = stockDTOMap.get(productoDTO.getId());
                    if (stockDTO == null) {
                        stockDTO = StockDTO.DEFAULT_STOCK_DTO;
                    }
                    return new Producto(productoDTO.getId(), stockDTO.getCod(), productoDTO.getNombre(), productoDTO.getDescripcion(), productoDTO.getPrecio(), stockDTO.getCantidadDisponible());
                })
                .collect(Collectors.toList());
    }

    public List<Producto> productsNotFound() {
        return Collections.EMPTY_LIST;
    }
}
