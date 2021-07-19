// Programa: Stock.java
// Descripcion:
// Autor: simon.castellanos@zeke.cl



package cl.srcei.oficinainternet.gestionstock.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stock {

    @Id
    private String productoId;
    private String cod;
    private int cantidadDisponible;

    protected Stock() {
    }

    public Stock(String productoId, String cod, int cantidadDisponible) {
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
