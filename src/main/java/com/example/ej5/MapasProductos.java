package com.example.ej5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapasProductos {
    public static void main(String[] args) {
        // HashMap: No garantiza orden en los elementos
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Laptop");
        hashMap.put(1, "Mouse");
        hashMap.put(2, "Teclado");
        System.out.println("HashMap: " + hashMap);

        // LinkedHashMap: Mantiene el orden de inserción
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "Laptop");
        linkedHashMap.put(1, "Mouse");
        linkedHashMap.put(2, "Teclado");
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // TreeMap: Ordena los elementos según la clave (orden natural o personalizado)
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Laptop");
        treeMap.put(1, "Mouse");
        treeMap.put(2, "Teclado");
        System.out.println("TreeMap: " + treeMap);
    }
}
