package com.example.ej4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TareaPorPrioridad colaDeTareas = new TareaPorPrioridad();

        Tarea tarea1 = new Tarea("Resolver ejercicio de listas", Materia.ESTRUCTURA_DE_DATOS, LocalDate.now().plusDays(2));
        Tarea tarea2 = new Tarea("Proyecto de software", Materia.INGENIERIA_DE_SOFTWARE, LocalDate.now().plusDays(5));
        Tarea tarea3 = new Tarea("Taller de ecuaciones diferenciales", Materia.ECUACIONES_DIFERENCIALES, LocalDate.now().plusDays(1));
        Tarea tarea4 = new Tarea("Examen de cálculo", Materia.CALCULO_MULTIVARIADO, LocalDate.now().plusDays(7));

        colaDeTareas.agregarTarea(tarea1);
        colaDeTareas.agregarTarea(tarea2);
        colaDeTareas.agregarTarea(tarea3);
        colaDeTareas.agregarTarea(tarea4);

        System.out.println("Tareas en orden de prioridad:");
        while (!colaDeTareas.estaVacia()) {
            System.out.println(colaDeTareas.obtenerSiguienteTarea());
        }
    }
}