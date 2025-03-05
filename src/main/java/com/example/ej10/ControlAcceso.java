package com.example.ej10;

import java.util.HashSet;

public class ControlAcceso {
    private HashSet<String> empleadosAutorizados;

    public ControlAcceso() {
        this.empleadosAutorizados = new HashSet<>();
    }

    public void registrarEmpleado(String idEmpleado) {
        if (empleadosAutorizados.add(idEmpleado)) {
            System.out.println("Empleado registrado con éxito: " + idEmpleado);
        } else {
            System.out.println("Error: El empleado " + idEmpleado + " ya está registrado.");
        }
    }

    public boolean verificarAcceso(String idEmpleado) {
        if (empleadosAutorizados.contains(idEmpleado)) {
            System.out.println("Acceso concedido a: " + idEmpleado);
            return true;
        } else {
            System.out.println("Acceso denegado a: " + idEmpleado);
            return false;
        }
    }

    public void eliminarEmpleado(String idEmpleado) {
        if (empleadosAutorizados.remove(idEmpleado)) {
            System.out.println("Empleado eliminado: " + idEmpleado);
        } else {
            System.out.println("Error: El empleado " + idEmpleado + " no está registrado.");
        }
    }

    public void mostrarEmpleadosAutorizados() {
        if (empleadosAutorizados.isEmpty()) {
            System.out.println("No hay empleados autorizados.");
        } else {
            System.out.println("Empleados autorizados:");
            empleadosAutorizados.forEach(id -> System.out.println("- " + id));
        }
    }
}