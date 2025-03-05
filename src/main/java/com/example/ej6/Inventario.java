package com.example.ej6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        if (buscarProducto(producto.getCodigo()) == null) {
            productos.add(producto);
            System.out.println("Producto agregado: " + producto);
        } else {
            System.out.println("Error: Ya existe un producto con el código " + producto.getCodigo());
        }
    }

    public void eliminarProductoAgotado(String codigo) {
        boolean eliminado = productos.removeIf(producto -> producto.getCodigo().equals(codigo));
        if (eliminado) {
            System.out.println("Producto con código " + codigo + " eliminado del inventario.");
        } else {
            System.out.println("Error: No se encontró el producto con código " + codigo);
        }
    }

    public Producto buscarProducto(String codigo) {
        return productos.stream()
                .filter(producto -> producto.getCodigo().equals(codigo))
                .findFirst()
                .orElse(null);
    }

    public List<Producto> listarPorNombre() {
        return productos.stream()
                .sorted(Comparator.comparing(Producto::getNombre))
                .toList();
    }

    public List<Producto> listarPorPrecio() {
        return productos.stream()
                .sorted(Comparator.comparingDouble(Producto::getPrecio))
                .toList();
    }
}