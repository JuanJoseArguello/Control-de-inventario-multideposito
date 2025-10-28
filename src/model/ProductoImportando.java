package model;

import java.time.LocalDate;

public class ProductoImportando extends Producto{
    private double impuestoAdicional = 0.05;

    public ProductoImportando(String nombre, double precio, int cant, LocalDate fechaIngreso) {
        super(nombre, precio, cant, fechaIngreso);
    }

    @Override
    public String toString() {
        return "ProductoImportando [impuestoAdicional=" + impuestoAdicional + ", " + super.toString() + "]";
    }

}
