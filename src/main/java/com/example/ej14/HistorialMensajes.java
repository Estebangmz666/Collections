package com.example.ej14;

import java.util.ArrayDeque;
import java.util.Deque;

public class HistorialMensajes {
    private Deque<String> mensajes;
    private int capacidad;

    public HistorialMensajes(int capacidad) {
        this.capacidad = capacidad;
        mensajes = new ArrayDeque<>(capacidad);
    }

    public void agregarMensaje(String mensaje) {
        if (mensajes.size() == capacidad) {
            mensajes.removeFirst();
        }
        mensajes.addLast(mensaje);
    }

    public void mostrarHistorial() {
        for (String mensaje : mensajes) {
            System.out.println(mensaje);
        }
    }
}
