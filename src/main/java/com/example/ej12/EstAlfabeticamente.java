package com.example.ej12;

import java.util.TreeSet;

public class EstAlfabeticamente {
    
     public static void main(String[] args) {
        // Creamos un TreeSet para almacenar los nombres de los estudiantes
        TreeSet<String> estudiantes = new TreeSet<>();

        estudiantes.add("santiago");
        estudiantes.add("Camila");
        estudiantes.add("Esteban");
        estudiantes.add("Jacobo");
        estudiantes.add("Maria");
        estudiantes.add("Laura");

        // Imprimir todos los nombres en orden alfabético
        System.out.println("Nombres de los estudiantes en orden alfabético:");
        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        // Obtener y mostrar el primer y el último nombre de la lista
        String primerNombre = estudiantes.first();
        String ultimoNombre = estudiantes.last();
        System.out.println("\nPrimer nombre en la lista: " + primerNombre);
        System.out.println("Último nombre en la lista: " + ultimoNombre);
    }
}
