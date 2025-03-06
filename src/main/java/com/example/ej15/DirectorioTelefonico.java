package com.example.ej15;

import java.util.HashMap;
import java.util.Map;

public class DirectorioTelefonico {
    public static void main(String[] args) {
        HashMap<String,String> directorio = new HashMap<>();

         // Agregar contactos al directorio
        directorio.put("Ana", "555-1234");
        directorio.put("Juan", "555-5678");
        directorio.put("Pedro", "555-8765");
        directorio.put("Laura", "555-4321");
        directorio.put("María", "555-6789");
        directorio.put("María", "555-6789");

        // Mostrar el directorio completo
        System.out.println("Directorio telefónico:");
        for (Map.Entry<String, String> entrada : directorio.entrySet()) {
            System.out.println("Nombre: " + entrada.getKey() + ", Número: " + entrada.getValue());
        }
    // Buscar un número de teléfono por nombre
    String nombreBuscado = "Juan";
    String numeroBuscado = directorio.get(nombreBuscado);
    System.out.println("\nNúmero de " + nombreBuscado + ": " + numeroBuscado);
    }
}
