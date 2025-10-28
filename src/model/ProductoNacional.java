package model;

import java.time.LocalDate;

public class ProductoNacional extends Producto{
    public ProductoNacional(String nombre, double precio, int cant, LocalDate fechaIngreso){
        super(nombre, precio, cant, fechaIngreso);
    }
}
