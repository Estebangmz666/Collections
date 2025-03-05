package com.example.ej4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Tarea implements Comparable<Tarea> {
    private String nombre;
    private Materia materia;
    private LocalDate fechaEntrega;
    private int prioridad;

    public Tarea(String nombre, Materia materia, LocalDate fechaEntrega) {
        this.nombre = nombre;
        this.materia = materia;
        this.fechaEntrega = fechaEntrega;
        this.prioridad = calcularPrioridad(fechaEntrega);
    }

    public String getNombre() {
        return nombre;
    }

    public Materia getMateria() {
        return materia;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
        this.prioridad = calcularPrioridad(fechaEntrega); // Recalcular prioridad
    }

    private static int calcularPrioridad(LocalDate fechaEntrega) {
        long diasFaltantes = LocalDate.now().until(fechaEntrega, ChronoUnit.DAYS);

        if (diasFaltantes <= 1) return 1;
        else if (diasFaltantes <= 3) return 2;
        else if (diasFaltantes <= 5) return 3;
        else if (diasFaltantes <= 7) return 4;
        else return 5;
    }

    public static Tarea crearTarea(TareaDTO tareaDTO) {
        return new Tarea(tareaDTO.getNombre(), tareaDTO.getMateria(), tareaDTO.getFechaEntrega());
    }

    @Override
    public int compareTo(Tarea otra) {
        return Integer.compare(this.prioridad, otra.prioridad);
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", materia=" + materia +
                ", fechaEntrega=" + fechaEntrega +
                ", prioridad=" + prioridad +
                '}';
    }
}