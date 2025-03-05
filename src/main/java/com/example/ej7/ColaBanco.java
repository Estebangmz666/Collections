package com.example.ej7;

import java.util.LinkedList;

public class ColaBanco {
    private LinkedList<String> colaClientes;

    public ColaBanco() {
        this.colaClientes = new LinkedList<>();
    }

    public void agregarCliente(String cliente) {
        colaClientes.addLast(cliente);
        System.out.println(cliente + " ha sido agregado a la cola.");
    }

    public String atenderCliente() {
        if (colaClientes.isEmpty()) {
            return "No hay clientes en espera.";
        }
        String clienteAtendido = colaClientes.pollFirst();
        System.out.println("Atendiendo a: " + clienteAtendido);
        return clienteAtendido;
    }

    public void agregarClienteUrgente(String cliente) {
        colaClientes.addFirst(cliente);
        System.out.println(cliente + " ha sido agregado con urgencia al inicio de la cola.");
    }

    public boolean estaVacia() {
        return colaClientes.isEmpty();
    }

    public void mostrarCola() {
        if (colaClientes.isEmpty()) {
            System.out.println("No hay clientes en espera.");
        } else {
            System.out.println("Cola de espera: " + colaClientes);
        }
    }
}