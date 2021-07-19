// Programa: Producto.java
// Descripcion: 
// Autor: simon.castellanos@zeke.cl


package cl.srcei.oficinainternet.comprafront.model;

import java.math.BigDecimal;

public class Producto {
    private String id;
    private String cod;
    private String nombre;
    private String descripcion;
    private BigDecimal precio;
    private int cantidadDisponible;

    public Producto(String id, String nombre, String descripcion, BigDecimal precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Producto(String id, String cod, String nombre, String descripcion, BigDecimal precio, int cantidadDisponible) {
        this.id = id;
        this.cod = cod;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getId() {
        return id;
    }

    public String getCod() {
        return cod;
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

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }
}
