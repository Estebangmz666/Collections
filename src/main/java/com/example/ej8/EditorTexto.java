package com.example.ej8;

import java.util.Vector;

public class EditorTexto {
    private Vector<String> historialCambios;

    public EditorTexto() {
        this.historialCambios = new Vector<>();
    }

    public void agregarCambio(String cambio) {
        historialCambios.add(cambio);
        System.out.println("Cambio agregado: " + cambio);
    }

    public String deshacer() {
        if (!historialCambios.isEmpty()) {
            String cambioEliminado = historialCambios.remove(historialCambios.size() - 1);
            System.out.println("Cambio deshecho: " + cambioEliminado);
            return cambioEliminado;
        }
        System.out.println("No hay cambios para deshacer.");
        return null;
    }

    public void mostrarHistorial() {
        if (historialCambios.isEmpty()) {
            System.out.println("No hay cambios en el historial.");
        } else {
            System.out.println("Historial de cambios:");
            for (int i = 0; i < historialCambios.size(); i++) {
                System.out.println((i + 1) + ". " + historialCambios.get(i));
            }
        }
    }
}