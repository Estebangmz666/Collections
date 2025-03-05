package com.example.ej4;

import java.time.LocalDate;

public class TareaDTO {
    private String nombre;
    private Materia materia;
    private LocalDate fechaEntrega;

    public TareaDTO(String nombre, Materia materia, LocalDate fechaEntrega) {
        this.nombre = nombre;
        this.materia = materia;
        this.fechaEntrega = fechaEntrega;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
}