package com.example.ej2;

import java.util.ArrayDeque;
import java.util.UUID;

public class PilaRestrictiva {
    private ArrayDeque<Object> pila = new ArrayDeque<>();

    public void push(Object obj) {
        if (pila.isEmpty() || pila.peek().getClass().equals(obj.getClass())) {
            pila.push(obj);
            System.out.println("Se agregó: " + obj.getClass().getSimpleName());
        } else {
            System.out.println("Error: No se puede agregar " + obj.getClass().getSimpleName() + 
                               " porque la cima es de tipo " + pila.peek().getClass().getSimpleName());
        }
    }

    public Object pop() {
        if (!pila.isEmpty()) {
            return pila.pop();
        }
        System.out.println("Error: La pila está vacía");
        return null;
    }

    public Object peek() {
        return pila.peek();
    }

    public int size() {
        return pila.size();
    }

    public boolean isEmpty() {
        return pila.isEmpty();
    }

    public void clear() {
        pila.clear();
    }

    public boolean contains(Object obj) {
        return pila.contains(obj);
    }

    public static void main(String[] args) {
        PilaRestrictiva pila = new PilaRestrictiva();

        Objeto1 objeto1 = new Objeto1("Juan", 20);
        Objeto1 objeto2 = new Objeto1("Pedro", 30);
        Objeto objeto3 = new Objeto("Maria", 25, 1);
        Objeto objeto4 = new Objeto("Ana", 35, 2);
        Objeto2 objeto5 = new Objeto2(UUID.randomUUID());
        Objeto2 objeto6 = new Objeto2(UUID.randomUUID());
        Objeto1 objeto7 = new Objeto1("Luis", 37);

        pila.push(objeto1); // ✅ OK
        pila.push(objeto2); // ✅ OK (mismo tipo que la cima)
        pila.push(objeto3); // ❌ ERROR (tipo diferente al de la cima)

        pila.pop(); // Saca objeto2
        pila.push(objeto3); // ✅ OK (ahora la cima permite otro tipo)

        pila.push(objeto4); // ✅ OK (mismo tipo que la cima)
        pila.push(objeto5); // ❌ ERROR (tipo diferente a la cima)

        pila.pop(); // Saca objeto4
        pila.push(objeto5); // ✅ OK (ahora la cima permite otro tipo)
        pila.push(objeto6); // ✅ OK (mismo tipo que la cima)

        pila.push(objeto7); // ❌ ERROR (tipo diferente a la cima)
        for (Object element : pila.pila){
            System.out.println(element.toString());
        }
    }
}