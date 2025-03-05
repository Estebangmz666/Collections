package com.example.ej11;

import java.util.LinkedHashSet;

public class FavoritosMusica {
    private LinkedHashSet<String> cancionesFavoritas;

    public FavoritosMusica() {
        this.cancionesFavoritas = new LinkedHashSet<>();
    }

    // Agregar una canción a favoritos
    public void agregarCancion(String cancion) {
        if (cancionesFavoritas.add(cancion)) {
            System.out.println("✅ " + cancion + " ha sido añadida a favoritos.");
        } else {
            System.out.println("⚠️ " + cancion + " ya está en favoritos.");
        }
    }

    // Eliminar una canción de favoritos
    public void eliminarCancion(String cancion) {
        if (cancionesFavoritas.remove(cancion)) {
            System.out.println("❌ " + cancion + " ha sido eliminada de favoritos.");
        } else {
            System.out.println("⚠️ " + cancion + " no está en favoritos.");
        }
    }

    // Verificar si una canción está en favoritos
    public boolean contieneCancion(String cancion) {
        return cancionesFavoritas.contains(cancion);
    }

    // Listar todas las canciones favoritas
    public void listarFavoritos() {
        if (cancionesFavoritas.isEmpty()) {
            System.out.println("📭 No hay canciones en favoritos.");
        } else {
            System.out.println("🎵 Canciones favoritas:");
            cancionesFavoritas.forEach(c -> System.out.println("- " + c));
        }
    }

    @Override
    public String toString() {
        return cancionesFavoritas.isEmpty() ? "📭 No hay canciones en favoritos." : "🎵 Canciones favoritas: " + cancionesFavoritas;
    }
}