package com.example.ej8;

public class Main {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();

        // Agregar cambios al historial
        editor.agregarCambio("Escribí el primer párrafo.");
        editor.agregarCambio("Corrigí una falta de ortografía.");
        editor.agregarCambio("Agregué una cita importante.");

        // Mostrar historial de cambios
        editor.mostrarHistorial();

        // Deshacer el último cambio
        editor.deshacer();

        // Mostrar historial después de deshacer
        editor.mostrarHistorial();

        // Deshacer otro cambio
        editor.deshacer();

        // Deshacer hasta que no haya más cambios
        editor.deshacer();
        editor.deshacer();

        // Intentar deshacer cuando no hay cambios
        editor.deshacer();

        // Mostrar historial vacío
        editor.mostrarHistorial();
    }
}