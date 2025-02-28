package com.example.ej1;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.agregarProducto(new Producto(2, "Leche"));
        empresa.agregarProducto(new Producto(1, "Arroz"));  
        empresa.agregarProducto(new Producto(3, "Azúcar"));

        Producto producto = empresa.buscarProductoPorCodigo(1);
        if (producto != null) {
            System.out.println("Producto encontrado: " + producto);
        } else {
            System.out.println("Producto no encontrado");
        }
    }
}
