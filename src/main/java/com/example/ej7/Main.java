package com.example.ej7;

public class Main {
    public static void main(String[] args) {
        ColaBanco colaBanco = new ColaBanco();

        // Agregar clientes a la cola
        colaBanco.agregarCliente("Juan");
        colaBanco.agregarCliente("María");
        colaBanco.agregarCliente("Carlos");

        // Mostrar la cola actual
        colaBanco.mostrarCola();

        // Agregar un cliente con urgencia
        colaBanco.agregarClienteUrgente("Ana");

        // Mostrar la cola después de la urgencia
        colaBanco.mostrarCola();

        // Atender a los clientes
        colaBanco.atenderCliente();
        colaBanco.atenderCliente();

        // Mostrar la cola después de atender a algunos clientes
        colaBanco.mostrarCola();

        // Atender a todos los clientes restantes
        colaBanco.atenderCliente();
        colaBanco.atenderCliente();

        // Intentar atender a alguien cuando la cola está vacía
        colaBanco.atenderCliente();

        // Mostrar la cola vacía
        colaBanco.mostrarCola();
    }
}