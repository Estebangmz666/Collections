package com.example.ej9;

import java.util.Stack;

public class NavegacionWeb {
    private Stack<String> historial;

    public NavegacionWeb() {
        this.historial = new Stack<>();
    }

    public void visitarPagina(String url) {
        historial.push(url);
        System.out.println("Visitaste: " + url);
    }

    public String retroceder() {
        if (historial.size() > 1) { // Debe haber al menos dos páginas para retroceder
            String paginaEliminada = historial.pop();
            System.out.println("Retrocediendo desde: " + paginaEliminada);
            System.out.println("Ahora estás en: " + historial.peek());
            return historial.peek();
        } else if (historial.size() == 1) {
            System.out.println("No hay más páginas en el historial.");
            return "No hay más páginas en el historial.";
        }
        System.out.println("No hay páginas para retroceder.");
        return "No hay páginas para retroceder.";
    }

    public void mostrarHistorial() {
        if (historial.isEmpty()) {
            System.out.println("El historial de navegación está vacío.");
        } else {
            System.out.println("Historial de navegación:");
            for (int i = historial.size() - 1; i >= 0; i--) {
                System.out.println((historial.size() - i) + ". " + historial.get(i));
            }
        }
    }
}