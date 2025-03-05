package com.example.ej1;

import java.util.TreeSet;

public class Empresa {
    private TreeSet<Producto> productos;

    public Empresa() {
        productos = new TreeSet<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Producto buscarProductoPorCodigo(int codigo) {
        Producto clave = new Producto(codigo, ""); 
        return productos.contains(clave) ? productos.floor(clave) : null;
    }
}