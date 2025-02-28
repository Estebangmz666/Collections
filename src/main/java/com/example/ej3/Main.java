package com.example.ej3;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Crear una colección de elementos que no permita duplicados
        Set<String> elementos = new HashSet<>();

        // Agregar elementos a la colección
        elementos.add("Balon");
        elementos.add("Ropa");
        elementos.add("Ropa"); // Este elemento duplicado no será agregado
        elementos.add("Computador"); 

        // Imprimir los elementos de la colección
        for (String elemento : elementos) {
            System.out.println(elemento);
        }
    }
}
