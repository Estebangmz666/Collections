package com.example.ej2;

public class Objeto {
    private String nombre;
    private Integer edad;
    private Integer id;

    public Objeto(String nombre, Integer edad, Integer id) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public Integer getId() {
        return id;
    }
}