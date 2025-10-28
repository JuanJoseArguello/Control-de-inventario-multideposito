package view;

import java.time.LocalDate;
import java.util.Scanner;

import controller.Depositos;

public class App {
    public static void main(String[] args) {
        Depositos d = new Depositos();
        Scanner sc = new Scanner(System.in);
        String op = "";
        do {
            System.out.println("""
                    Qué accion desea realizar:
                    1. Ingresar un producto.
                    2. Retirar un producto.
                    3. Ver posiciones vacias.
                    0. Salir.
                    """);
            op = sc.nextLine();
            switch (op) {
                case "1": // Ingresar producto:
                    System.out.println("""
                            Qué tipo de producto desea retirar:
                            1. Producto Importado.
                            2. Producto Nacional.
                            """);
                    String op1 = sc.nextLine();
                    switch (op1) {
                        case "1": // Producto Importado
                            System.out.println("Ingrese el nombre del producto: ");
                            String producto = sc.nextLine();
                            System.out.println("Ingrese el precio del producto: ");
                            String precio = sc.nextLine();
                            System.out.println("Ingrese la cantidad del producto: ");
                            String cant = sc.nextLine();
                            System.out.println("Ingrese la fecha de ingreso del producto (YYYY-MM-DD): ");
                            String fechaIngreso = sc.nextLine();
                            System.out.println("""
                                    Ingrese el depósito en el que desea agregar el producto:
                                    1. Depósito A
                                    2. Depósito B
                                    3. Depósito C
                                    """);
                            String deposito = sc.nextLine();
                            System.out.println("Ingrese la fila para guardar el producto: ");
                            int x = sc.nextInt();
                            System.out.println("Ingrese la columna para guardar el producto: ");
                            int y = sc.nextInt();
                            d.crearProductoImportado(producto, Double.parseDouble(precio), Integer.parseInt(cant),
                                    LocalDate.parse(fechaIngreso), Integer.parseInt(deposito), x, y);

                            break;
                        case "2": // Producto Nacional
                            System.out.println("Ingrese el nombre del producto: ");
                            String productoN = sc.nextLine();
                            System.out.println("Ingrese el precio del producto: ");
                            String precioN = sc.nextLine();
                            System.out.println("Ingrese la cantidad del producto: ");
                            String cantN = sc.nextLine();
                            System.out.println("Ingrese la fecha de ingreso del producto (YYYY-MM-DD): ");
                            String fechaIngresoN = sc.nextLine();
                            System.out.println("""
                                    Ingrese el depósito en el que desea agregar el producto:
                                    1. Depósito A
                                    2. Depósito B
                                    3. Depósito C
                                    """);
                            String depositoN = sc.nextLine();
                            System.out.println("Ingrese la fila para guardar el producto: ");
                            int xN = sc.nextInt();
                            System.out.println("Ingrese la columna para guardar el producto: ");
                            int yN = sc.nextInt();
                            d.crearProductoNacional(productoN, Double.parseDouble(precioN), Integer.parseInt(cantN),
                                    LocalDate.parse(fechaIngresoN), Integer.parseInt(depositoN), xN, yN);

                            break;

                        default:
                            System.out.println("Opción inválida");
                            break;
                    }

                    break;
                case "2": // Retirar producto:
                    System.out.println("""
                            Qué tipo de producto desea retirar:
                            1. Producto Importado.
                            2. Producto Nacional.
                            """);
                    String op2 = sc.nextLine();
                    switch (op2) {
                        case "1": // Producto Importado
                            System.out.println("""
                                    Ingrese el depósito en el que desea agregar el producto:
                                    1. Depósito A
                                    2. Depósito B
                                    3. Depósito C
                                    """);
                            String deposito = sc.nextLine();
                            System.out.println("Ingrese la fila para guardar el producto: ");
                            int x = sc.nextInt();
                            System.out.println("Ingrese la columna para guardar el producto: ");
                            int y = sc.nextInt();
                            d.retirarProductoImportado(Integer.parseInt(deposito), x, y);

                            break;
                        case "2": // Producto Nacional
                            System.out.println("""
                                    Ingrese el depósito en el que desea agregar el producto:
                                    1. Depósito A
                                    2. Depósito B
                                    3. Depósito C
                                    """);
                            String depositoN = sc.nextLine();
                            System.out.println("Ingrese la fila para guardar el producto: ");
                            int xN = sc.nextInt();
                            System.out.println("Ingrese la columna para guardar el producto: ");
                            int yN = sc.nextInt();
                            d.retirarProductoNacional(Integer.parseInt(depositoN), xN, yN);

                            break;

                        default:
                            System.out.println("Opción inválida");
                            break;
                    }
                    break;
                case "3":
                    System.out.println("""
                        Ingrese el depósito del cual desea conocer las posiciones vacias:
                            1. Depósito A
                            2. Depósito B
                            3. Depósito C
                                """);
                    String deposito = sc.nextLine(); 
                    d.posicionesVacias(Integer.parseInt(deposito));

                    break;
                case "0":
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (!op.equals("0"));

    }
}
