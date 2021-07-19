// Programa: StockDTO.java
// Descripcion:
// Autor: simon.castellanos@zeke.cl


package cl.srcei.oficinainternet.comprafront.services.dto;

public class StockDTO {
    private String productoId;
    private String cod;
    private int cantidadDisponible;

    public static final StockDTO DEFAULT_STOCK_DTO = new StockDTO("", "default", 999);

    public StockDTO() {
    }

    public StockDTO(String productoId, String cod, int cantidadDisponible) {
        this.productoId = productoId;
        this.cod = cod;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getProductoId() {
        return productoId;
    }

    public String getCod() {
        return cod;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }
}
