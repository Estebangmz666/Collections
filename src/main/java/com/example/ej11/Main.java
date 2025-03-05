package com.example.ej11;

public class Main {
    public static void main(String[] args) {
        FavoritosMusica favoritos = new FavoritosMusica();

        // Agregar canciones
        favoritos.agregarCancion("Master of Puppets");
        favoritos.agregarCancion("Fear of the Dark");
        favoritos.agregarCancion("Prison Song");
        favoritos.agregarCancion("Master of Puppets"); // Prueba duplicado

        // Mostrar canciones favoritas
        favoritos.listarFavoritos();

        // Verificar si una canción está en favoritos
        System.out.println("\n¿Está 'Fear of the Dark' en favoritos? " + favoritos.contieneCancion("Fear of the Dark"));

        // Eliminar una canción
        favoritos.eliminarCancion("Fear of the Dark");
        favoritos.eliminarCancion("Nothing Else Matters"); // No está en favoritos

        // Mostrar canciones después de eliminar
        favoritos.listarFavoritos();
    }
}