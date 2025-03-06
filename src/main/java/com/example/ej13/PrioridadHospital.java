package com.example.ej13;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PrioridadHospital {
    public static void main(String[] args) {
        // Creamos un comparador para ordenar los pacientes según su prioridad
        Comparator<Paciente> comparadorPrioridad = (p1, p2) -> Integer.compare(p2.getPrioridad(), p1.getPrioridad());

        // Crear una PriorityQueue con el comparador
        PriorityQueue<Paciente> colaPacientes = new PriorityQueue<>(comparadorPrioridad);

        // Agregar pacientes a la cola con sus niveles de prioridad
        colaPacientes.add(new Paciente("Ana", 5));
        colaPacientes.add(new Paciente("Juan", 2));
        colaPacientes.add(new Paciente("Pedro", 3));
        colaPacientes.add(new Paciente("Laura", 1));
        colaPacientes.add(new Paciente("María", 4));

        // Atender a los pacientes según la prioridad
        System.out.println("Atendiendo a los pacientes según su prioridad:");
        while (!colaPacientes.isEmpty()) {
            System.out.println(colaPacientes.poll());
        }
    }
}