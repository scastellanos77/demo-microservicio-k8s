// Programa: StockService.java
// Descripcion:
// Autor 


package cl.srcei.oficinainternet.gestionstock.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.srcei.oficinainternet.gestionstock.exceptions.StockNotFoundException;
import cl.srcei.oficinainternet.gestionstock.model.Stock;
import cl.srcei.oficinainternet.gestionstock.repositories.StockRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class StockService {

    private StockRepository stockRepository;

    @Autowired
    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public List<Stock> getStocks() {
        return StreamSupport.stream(stockRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public Stock getStock(String productoId) throws StockNotFoundException {
        return stockRepository.findById(productoId)
                .orElseThrow(() -> new StockNotFoundException("Stock no fue encontrado con productoID: " + productoId));
    }
}
