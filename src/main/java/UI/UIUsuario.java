package UI;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import Entidades.Aplication;

public class UIUsuario {
    @Autowired
    private static Aplication aplication;

    public static void menu() {
        
        int response = 0;
        do {
            System.out.println("===========================");
            System.out.println("         PLAYLIST         ");
            System.out.println("===========================");
            System.out.println("Selecciona la opción deseada:");
            System.out.println("---------------------------");
            System.out.println("1. Ver canciones");
            System.out.println("2. Ver Canciones por genero ");
            System.out.println("3. Ver Canciones por año");
            System.out.println("4. Ver Canciones por duración");
            System.out.println("4. Ver Canciones por fecha");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("Canciones registradas");
                    Entidades.Aplication.Biblioteca();

                    break;
                case 2:
                    System.out.println("Generos de canciones");

                    break;
                case 3:
                    System.out.println("Año de publicación de canciones");
                    break;
                case 4:
                    System.out.println("Tiempo de duración de canciones");
                    break;
                case 5:
                    System.out.println("Orden de canciones por fecha");
                    break;
                case 0:
                    System.out.println("¡Gracias por visitar PLAYLIST!");
                    break;
                default:
                    System.out.println("Ingresa un valor correcto");
            }

        } while (response != 0);
    }
}
