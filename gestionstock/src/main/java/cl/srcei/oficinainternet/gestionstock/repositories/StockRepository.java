// Programa: StockRepository.java
// Descripcion:
// Autor: simon.castellanos@zeke.cl


package cl.srcei.oficinainternet.gestionstock.repositories;

import org.springframework.data.repository.CrudRepository;
import cl.srcei.oficinainternet.gestionstock.model.Stock;

public interface StockRepository extends CrudRepository<Stock, String> {
}
