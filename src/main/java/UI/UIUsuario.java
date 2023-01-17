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
        this.album = album;
        this.b = b;
    }

    // Metodo para almacenar biblioteca de canciones
    public static void llenarBiblioteca() {
        canciones = new ArrayList<>();
        album = new ArrayList<>();
        b = new Biblioteca(canciones, album);
        Cancion cancion = new Cancion(1, "Adonay", LocalDate.of(2001, 3, 4), 150, "Salsa", null, "cancion");
        Cancion cancion2 = new Cancion(2, "Limoncito con ron", LocalDate.of(1970, 5, 22), 400, "Salsa", null,
                "cancion");
        Cancion cancion3 = new Cancion(3, "Amante", LocalDate.of(1998, 4, 13), 322, "Vallenatos", null, "cancion");
        Cancion cancion4 = new Cancion(3, "Amante", LocalDate.of(2009, 4, 13), 222, "Salsa", null, "cancion");
        Cancion cancion5 = new Cancion(3, "Amante", LocalDate.of(2021, 4, 13), 456, "Vallenatos", null, "cancion");

        canciones.add(cancion);
        canciones.add(cancion2);
        canciones.add(cancion3);
        canciones.add(cancion4);
        canciones.add(cancion5);
        Album album1 = new Album(1, "salida", canciones);
        album.add(album1);
    }

    // Metodo que retorna menú de interfaz de usuario
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
            System.out.println("6. Crear playlist");
            System.out.println("0. Salir");
            Scanner sc = new Scanner(System.in);
            // Captura la opción establecida por el usuario
            response = Integer.valueOf(sc.nextLine());
            // switch para evaluar los respectivos metodos según el caso
            switch (response) {
                // Caso 1 para mostrar lista de canciones
                case 1:
                    System.out.println("Canciones registradas");
                    System.out.println("===========================");
                    b.mostrarCanciones();
                    break;
                // Caso 2 para mostrar canciones por genero
                case 2:
                    System.out.println("Canciones Genero Escogido");
                    System.out.println("===========================");
                    b.cancionesSegunGenero("Salsa");
                    break;
                // Caso 3 para mostrar canciones según año.
                case 3:
                    System.out.println("Canciones Año de publicación");
                    System.out.println("===========================");
                    b.cancionesSegunAño(2000);
                    break;
                // Caso 4 para mostrar canciones por duración
                case 4:
                    System.out.println("Tiempo de duración de canciones");
                    System.out.println("===========================");
                    b.ordenarPorDuracion(canciones);
                    break;
                case 5:
                    // Caso 5 para mostrar canciones por fecha
                    System.out.println("Orden de canciones por fecha");
                    System.out.println("===========================");
                    b.ordenarPorFecha(canciones);
                    break;
                case 6:
                    // Caso 6 para crear album
                    System.out.println("Crea tu playlist");
                    System.out.println("===========================");
                    System.out.println("");
                    crearAlbum(sc);
                    break;
                // Caso 7 para salir del menú principal
                case 0:
                    System.out.println("¡Gracias por visitar PLAYLIST!");

                    break;
                default:
                    System.out.println("Ingresa un valor correcto");
            }

        } while (response != 0);
    }

    // Metodo para crear album
    public static void crearAlbum(Scanner sc) {
        System.out.println("Ingrese los siguientes datos: ");
        try {
            // Solicitar nombre
            System.out.print("Nombre album: ");
            String nombre = sc.next();
            sc.nextLine();
            b.mostrarCanciones();
            System.out.print("Escribe el nombre de las canciones que desees agregar a la lista:");
            String canciones = sc.next();
            sc.nextLine();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
