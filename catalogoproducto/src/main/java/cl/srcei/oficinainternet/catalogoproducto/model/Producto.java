// Programa: Producto.java
// Descripcion:
// Autor: simon.castellanos@zeke.cl


package cl.srcei.oficinainternet.catalogoproducto.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class Producto {
    private String id;
    private String nombre;
    private String descripcion;
    private BigDecimal precio;

    public Producto() {
        // Needed for Jackson deserialization
    }

    public Producto(String id, String nombre, String descripcion, BigDecimal precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @JsonProperty
    public String getId() {
        return id;
    }

    @JsonProperty
    public String getNombre() {
        return nombre;
    }

    @JsonProperty
    public String getDescripcion() {
        return descripcion;
    }

    @JsonProperty
    public BigDecimal getPrecio() {
        return precio;
    }
}
