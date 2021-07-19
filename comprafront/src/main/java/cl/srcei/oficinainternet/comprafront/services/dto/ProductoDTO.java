// Programa: ProductoDTO.java
// Descripcion:
// Autor: simon.castellanos@zeke.cl

package cl.srcei.oficinainternet.comprafront.services.dto;

import java.math.BigDecimal;

public class ProductoDTO {
    private String id;
    private String nombre;
    private String descripcion;
    private BigDecimal precio;

    public ProductoDTO() {
    }

    public ProductoDTO(String id, String nombre, String descripcion, BigDecimal precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }
}
