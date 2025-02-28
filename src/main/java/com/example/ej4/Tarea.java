package com.example.ej4;

import java.time.LocalDate;

public class Tarea {
    private String nombre;
    private Materia materia;
    private LocalDate fechaEntrega;
    private Integer prioridad;

    public Tarea(String nombre, Materia materia, LocalDate fechaEntrega, Integer prioridad){
        this.nombre = nombre;
        this.materia = materia;
        this.fechaEntrega = fechaEntrega;
        this.prioridad = calcularPrioridad(prioridad);
    }

    public String getNombre(){
        return nombre;
    }

    public Materia getMateria(){
        return materia;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setMaterial(Materia materia){
        this.materia = materia;
    }

    public LocalDate getFechaEntrega(){
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega){
        this.fechaEntrega = fechaEntrega;
    }

    private static Integer calcularPrioridad(TareaDTO tarea){
        // Implementar
    }

    private static Tarea crearTarea(TareaDTO tarea, Integer prioridad){
        // Implementar}
    }
}