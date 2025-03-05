package com.example.ej10;

public class Main {
    public static void main(String[] args) {
        ControlAcceso control = new ControlAcceso();

        // Registrar empleados
        control.registrarEmpleado("EMP123");
        control.registrarEmpleado("EMP456");
        control.registrarEmpleado("EMP789");
        control.registrarEmpleado("EMP123"); // Intento duplicado

        // Mostrar empleados registrados
        control.mostrarEmpleadosAutorizados();

        // Verificar accesos
        control.verificarAcceso("EMP123");
        control.verificarAcceso("EMP999"); // No registrado

        // Eliminar un empleado y volver a verificar acceso
        control.eliminarEmpleado("EMP456");
        control.verificarAcceso("EMP456");

        // Mostrar empleados después de eliminar
        control.mostrarEmpleadosAutorizados();
    }
}