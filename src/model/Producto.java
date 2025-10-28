package model;

import java.time.LocalDate;

public class Producto{
    protected String nombre; 
    protected double precio; 
    protected int cant; 
    protected LocalDate fechaIngreso;
    
    public Producto(String nombre, double precio, int cant, LocalDate fechaIngreso) {
        this.nombre = nombre;
        this.precio = precio;
        this.cant = cant;
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", precio=" + precio + ", cant=" + cant + ", fechaIngreso=" + fechaIngreso
                + "]";
    } 

    

    
}