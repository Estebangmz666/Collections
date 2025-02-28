package com.example.ej1;

import java.util.TreeSet;

public class Empresa {
    // TreeSet es una implementación de la interfaz Set que almacena los elementos en un árbol rojo-negro.
    // Los elementos en un TreeSet están ordenados de forma natural (o por un comparador proporcionado).
    private TreeSet<Producto> productos;

    public Empresa() {
        // Inicializamos el TreeSet para almacenar los productos.
        productos = new TreeSet<>();
    }

    // Método para agregar un producto al TreeSet.
    // El TreeSet se encargará de mantener los productos ordenados por su código.
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Método para buscar un producto por su código.
    // Recorremos el TreeSet y comparamos el código de cada producto con el código buscado.
    public Producto buscarProductoPorCodigo(int codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigo) {
                return producto;
            }
        }
        return null; // Si no se encuentra el producto
    }
}
