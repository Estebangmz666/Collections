package com.example.ej9;

public class Main {
    public static void main(String[] args) {
        NavegacionWeb navegador = new NavegacionWeb();

        // Visitar páginas web
        navegador.visitarPagina("https://www.google.com");
        navegador.visitarPagina("https://www.github.com");
        navegador.visitarPagina("https://www.stackoverflow.com");
        navegador.visitarPagina("https://www.reddit.com");

        // Mostrar historial
        navegador.mostrarHistorial();

        // Retroceder en la navegación
        navegador.retroceder();
        navegador.retroceder();

        // Mostrar historial actualizado
        navegador.mostrarHistorial();

        // Seguir retrocediendo hasta vaciar el historial
        navegador.retroceder();
        navegador.retroceder();
        navegador.retroceder(); // Intento de retroceder cuando ya no hay páginas
    }
}