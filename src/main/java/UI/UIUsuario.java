package UI;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import Entidades.Album;
import Entidades.Biblioteca;
import Entidades.Cancion;
import org.springframework.beans.factory.annotation.Autowired;

public class UIUsuario {
    @Autowired
   private static Biblioteca b;

    private static ArrayList<Cancion> canciones;

    private static ArrayList<Album> album;

    public UIUsuario(Biblioteca b, ArrayList<Cancion> canciones, ArrayList<Album> album) {
        this.canciones = canciones;
        this.album =album;
        this.b = b;
    }
    public static void llenarBiblioteca(){
        canciones = new ArrayList<>();
        album = new ArrayList<>();
        b = new Biblioteca(canciones,album);
        Cancion cancion = new Cancion(1, "Adonay", LocalDate.of(2001,3,4), 150, "Salsa", null, "cancion");
        Cancion cancion2 = new Cancion(2, "Limoncito con ron",LocalDate.of(1970,5,22), 400, "Salsa", null, "cancion");
        Cancion cancion3 = new Cancion(3, "Amante", LocalDate.of(1998,4,13), 322, "Vallenatos", null, "cancion");
        Cancion cancion4 = new Cancion(3, "Amante", LocalDate.of(2009,4,13), 222, "Salsa", null, "cancion");
        Cancion cancion5 = new Cancion(3, "Amante", LocalDate.of(2021,4,13), 456, "Vallenatos", null, "cancion");

        canciones.add(cancion);
        canciones.add(cancion2);
        canciones.add(cancion3);
        canciones.add(cancion4);
        canciones.add(cancion5);
        Album album1 = new Album(1,"salida",canciones);
        album.add(album1);
    }
    public static void menu() {
        llenarBiblioteca();
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
            System.out.println("5. Ver Canciones por fecha");
            System.out.println("0. Salir");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch (response) {
                case 1:
                    System.out.println("Canciones registradas");
                    System.out.println("===========================");
                    b.mostrarCanciones();
                    break;
                case 2:
                    System.out.println("Canciones Genero Escogido");
                    System.out.println("===========================");
                    b.cancionesSegunGenero("Salsa");
                    break;
                case 3:
                    System.out.println("Canciones Año de publicación");
                    System.out.println("===========================");
                    b.cancionesSegunAño(2000);
                    break;
                case 4:
                    System.out.println("Tiempo de duración de canciones");
                    System.out.println("===========================");
                    b.ordenarPorDuracion(canciones);
                    break;
                case 5:
                    System.out.println("Orden de canciones por fecha");
                    System.out.println("===========================");
                    b.ordenarPorFecha(canciones);
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
