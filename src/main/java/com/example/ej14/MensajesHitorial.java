package com.example.ej14;


public class MensajesHitorial {
    public static void main(String[] args) {
        HistorialMensajes historial = new HistorialMensajes(10);

        // Agregar algunos mensajes al historial
        historial.agregarMensaje("Mensaje 1");
        historial.agregarMensaje("Mensaje 2");
        historial.agregarMensaje("Mensaje 3");
        historial.agregarMensaje("Mensaje 4");
        historial.agregarMensaje("Mensaje 5");
        historial.agregarMensaje("Mensaje 6");
        historial.agregarMensaje("Mensaje 7");
        historial.agregarMensaje("Mensaje 8");
        historial.agregarMensaje("Mensaje 9");
        historial.agregarMensaje("Mensaje 10");

        // Mostrar el historial actual
        System.out.println("Historial de mensajes:");
        historial.mostrarHistorial();

        // Agregar un nuevo mensaje y eliminar el más antiguo
        historial.agregarMensaje("Mensaje 11");
        System.out.println("\nHistorial de mensajes actualizado:");
        historial.mostrarHistorial();
    }
}
