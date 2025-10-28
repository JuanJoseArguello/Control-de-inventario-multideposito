package controller;

import java.time.LocalDate;

import model.Producto;
import model.ProductoImportando;

public class Depositos {
    Producto[][] depositoA = new Producto[5][5];
    Producto[][] depositoB = new Producto[5][5];
    Producto[][] depositoC = new Producto[5][5];

    public void posicionesVacias(int deposito) {
        switch (deposito) {
            case 1:
                for (int i = 0; i < getDeposito(deposito).length; i++) {
                    for (int j = 0; j < depositoA.length; j++) {
                        if (depositoA[i][j] == null)
                            System.out.print("(" + i + "," + j + ") ");
                    }
                    System.out.print("\n");
                }
                System.out.print("\n");
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }

    public Producto[][] getDeposito(int deposito) {
        switch (deposito) {
            case 1:
                return depositoA;
            case 2:
                return depositoB;
            case 3:
                return depositoC;
        }
        return null; 
    }

    public void crearProductoImportado(String nombre, double precio, int cant, LocalDate fechaIngreso, int deposito,
            int x, int y) {
        ProductoImportando p = new ProductoImportando(nombre, precio, cant, fechaIngreso);
        switch (deposito) {
            case 1:
                if (getDeposito(deposito)[x][y] == null) {
                    getDeposito(deposito)[x][y] = p;
                } else {
                    System.out.println("La posición ya está ocupada.");
                }
                break;
        }
    }

    public void crearProductoNacional(String nombre, double precio, int cant, LocalDate fechaIngreso, int deposito,
            int x, int y) {
        Producto p = new Producto(nombre, precio, cant, fechaIngreso);
        switch (deposito) {
            case 1:
                if (getDeposito(deposito)[x][y] == null) {
                    getDeposito(deposito)[x][y] = p;
                } else {
                    System.out.println("La posición ya está ocupada.");
                }
                break;
        }
    }

    public void retirarProductoImportado(int deposito,
            int x, int y) {
        switch (deposito) {
            case 1:
                if (getDeposito(deposito)[x][y] != null) {
                    getDeposito(deposito)[x][y] = null;
                } else {
                    System.out.println("No hay ningún producto en esa posición.");
                }
                break;
            }
    }

    public void retirarProductoNacional(int deposito,
            int x, int y) {
        switch (deposito) {
            case 1:
                if (getDeposito(deposito)[x][y] != null) {
                    getDeposito(deposito)[x][y] = null;
                } else {
                    System.out.println("No hay ningún producto en esa posición.");
                }
                break;
        }
    }
}
