// Programa: StockResource.java
// Descripcion:
// Autor: simon.castellanos@zeke.cl


package cl.srcei.oficinainternet.gestionstock.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import cl.srcei.oficinainternet.gestionstock.exceptions.StockNotFoundException;
import cl.srcei.oficinainternet.gestionstock.model.Stock;
import cl.srcei.oficinainternet.gestionstock.services.StockService;

import java.util.List;

@RestController
@RequestMapping("/stocks")
public class StockResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(StockResource.class);

    @Autowired
    private StockService stockService;

    @RequestMapping()
    public List<Stock> getStocks() {
        LOGGER.info("getStocks (All stocks)");
        return stockService.getStocks();
    }

    @RequestMapping("{productoId}")
    public Stock getStock(@PathVariable("productoId") String productoId) throws StockNotFoundException {
        LOGGER.info("getStock with productoId: {}", productoId);
        return stockService.getStock(productoId);
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void handleStockNotFound(StockNotFoundException snfe) {
    }
}
