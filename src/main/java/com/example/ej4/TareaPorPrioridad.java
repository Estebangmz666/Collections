package com.example.ej4;

import java.util.PriorityQueue;

public class TareaPorPrioridad {
    private PriorityQueue<Tarea> tareas;

    public TareaPorPrioridad() {
        this.tareas = new PriorityQueue<>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.offer(tarea);
    }

    public Tarea obtenerSiguienteTarea() {
        return tareas.poll();
    }

    public boolean estaVacia() {
        return tareas.isEmpty();
    }

    public void imprimirTareas() {
        for (Tarea tarea : tareas) {
            System.out.println(tarea);
        }
    }
}