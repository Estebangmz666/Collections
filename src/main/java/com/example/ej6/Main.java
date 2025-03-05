package com.example.ej6;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Agregar productos
        inventario.agregarProducto(new Producto("001", "Leche", 3.50));
        inventario.agregarProducto(new Producto("002", "Pan", 1.20));
        inventario.agregarProducto(new Producto("003", "Cereal", 4.80));
        inventario.agregarProducto(new Producto("002", "Chocolate", 2.00)); // Intento de duplicado

        // Buscar producto
        System.out.println("\nBuscando producto con código '002':");
        Producto encontrado = inventario.buscarProducto("002");
        System.out.println(encontrado != null ? encontrado : "No encontrado");

        // Eliminar producto
        System.out.println("\nEliminando producto con código '002':");
        inventario.eliminarProductoAgotado("002");

        // Listar productos por nombre
        System.out.println("\nProductos ordenados por nombre:");
        inventario.listarPorNombre().forEach(System.out::println);

        // Listar productos por precio
        System.out.println("\nProductos ordenados por precio:");
        inventario.listarPorPrecio().forEach(System.out::println);
    }
}