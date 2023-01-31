package com.company.directory;

import UI.UIUsuario;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Aplicación con lista de canciones que permite listar canciones, realizar
 * filtros a
 * a la biblioteca principal por genero, año, fecha de publicación y duración,
 */

// Clase main que retorna el metodo menú del package UI
@SpringBootApplication
public class BibliotecaCancionesApplication {
    public static void main(String[] args) {
        UIUsuario.menu();

    }
}
