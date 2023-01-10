package Entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public class Aplication {
    public static void Biblioteca() {

        ArrayList<Cancion> canciones = new ArrayList<>();
        Cancion cancion = new Cancion(1, "Adonay", LocalDate.of(2000,3,4), 123, "Salsa", null, "cancion");
        Cancion cancion2 = new Cancion(2, "Limoncito con ron",LocalDate.of(2004,5,22), 123, "Salsa", null, "cancion");
        Cancion cancion3 = new Cancion(3, "Amante", LocalDate.of(2000,4,13), 322, "Vallenatos", null, "cancion");
        canciones.add(cancion);
        canciones.add(cancion2);
        canciones.add(cancion3);
        Biblioteca b = new Biblioteca(canciones, null);
        ArrayList<Cancion> genero = new ArrayList<>();
        ArrayList<Cancion>anio = new ArrayList<>();
        genero = b.cancionesSegunGenero("Salsa");
        anio = b.cancionesSegunAño(LocalDate.of(2000,4,23));
             System.out.println(anio.size());
        for (int i = 0; i < genero.size(); i++) {
            System.out.println(genero.get(i).getTittle());
        }
        for (int i = 0; i < anio.size(); i++) {
            System.out.println(anio.get(i).getTittle());
        }
    }
}
