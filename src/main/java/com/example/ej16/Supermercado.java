package com.example.ej16;

import java.util.LinkedHashMap;
import java.util.Map;

public class Supermercado {
    public static void main(String[] args) {
         // Crear un LinkedHashMap para almacenar los productos y sus precios
        LinkedHashMap<String, Double> carrito = new LinkedHashMap<>();

        // Agregar productos al carrito en el orden en que se escanean
        carrito.put("Manzanas", 1.50);
        carrito.put("Pan", 2.00);
        carrito.put("Leche", 1.20);
        carrito.put("Huevos", 2.50);
        carrito.put("Queso", 3.80);

        // Mostrar los productos en el orden en que fueron añadidos
        System.out.println("Productos comprados en el orden escaneado:");
        for (Map.Entry<String, Double> entrada : carrito.entrySet()) {
            System.out.println("Producto: " + entrada.getKey() + ", Precio: $" + entrada.getValue());
        }

        // Calcular y mostrar el total de la compra
        double total = 0;
        for (double precio : carrito.values()) {
            total += precio;
        }
        System.out.println("\nTotal de la compra: $" + total);
    }
}
