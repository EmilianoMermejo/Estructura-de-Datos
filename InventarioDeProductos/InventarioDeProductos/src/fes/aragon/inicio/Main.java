package fes.aragon.inicio;

import fes.aragon.clases.ArbolBinarioBusqueda;
import fes.aragon.clases.Producto;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final ArbolBinarioBusqueda<Producto> inventario = new ArbolBinarioBusqueda<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1 -> agregarProducto(scanner);
                case 2 -> eliminarProducto(scanner);
                case 3 -> buscarProducto(scanner);
                case 4 -> listarInventario();
                case 0 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Sistema de Gestión de Inventario de Productos ---");
        System.out.println("1. Agregar producto");
        System.out.println("2. Eliminar producto");
        System.out.println("3. Buscar producto");
        System.out.println("4. Listar inventario");
        System.out.println("0. Salir");
        System.out.print("Selecciona una opción: ");
    }

    private static void agregarProducto(Scanner scanner) {
        System.out.println("\n--- Agregar Producto ---");

        System.out.print("Ingresa el ID del producto: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        if (inventario.buscar(new Producto("", id, 0, 0)) != null) {
            System.out.println("Error: Ya existe un producto con ese ID.");
            return;
        }

        System.out.print("Ingresa el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingresa la cantidad en inventario: ");
        int cantidad = scanner.nextInt();

        Producto producto = new Producto(nombre, id, precio, cantidad);
        inventario.insertar(producto);
        System.out.println("Producto agregado exitosamente.");
    }

    private static void eliminarProducto(Scanner scanner) {
        System.out.println("\n--- Eliminar Producto ---");

        System.out.print("Ingresa el ID del producto a eliminar: ");
        int id = scanner.nextInt();

        if (inventario.eliminar(new Producto("", id, 0, 0))) {
            System.out.println("Producto eliminado exitosamente.");
        } else {
            System.out.println("Error: Producto no encontrado.");
        }
    }

    private static void buscarProducto(Scanner scanner) {
        System.out.println("\n--- Buscar Producto ---");

        System.out.print("Ingresa el ID del producto a buscar: ");
        int id = scanner.nextInt();

        Producto producto = inventario.buscar(new Producto("", id, 0, 0));
        if (producto != null) {
            System.out.println("Producto encontrado: " + producto);
        } else {
            System.out.println("Error: Producto no encontrado.");
        }
    }

    private static void listarInventario() {
        System.out.println("\n--- Listar Inventario ---");

        List<Producto> productos = inventario.recorrerEnOrden();
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            productos.forEach(System.out::println);
        }
    }
}