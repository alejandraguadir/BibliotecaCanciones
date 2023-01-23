package Entidades;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 * Representa clase Biblioteca
 */

public class Biblioteca implements Comparator<Cancion> {

   // Atributos clase biblioteca

   /*
    atributo que hace referencia a lista de todas las canciones
    */
   private static ArrayList<Cancion> canciones;
   //atributo que hace referencia a las lista de albums
   private static ArrayList<Album> albums;

   // Constructor clase biblioteca
   public Biblioteca(ArrayList<Cancion> canciones, ArrayList<Album> albums) {
      this.canciones = canciones;
      this.albums = albums;
   }

   // Método para mostrar canciones
   public void mostrarCanciones() {
      for (int i = 0; i < canciones.size(); i++) {
         System.out.println(canciones.get(i).getTittle());
      }

   }

   // Metodo para listar canciones por genero
   public ArrayList cancionesSegunGenero(String gender) {
      ArrayList<Cancion> genero = new ArrayList<>();
      for (int i = 0; i < canciones.size(); i++) {
         if (gender.equals(canciones.get(i).getGender())) {
            genero.add(canciones.get(i));
            System.out.println(canciones.get(i).getTittle());
         }
      }
      return genero;
   }

   // Metodo para filtrar canciones por año
   public ArrayList cancionesSegunAño(int fecha) {
      ArrayList<Cancion> anio = new ArrayList<>();
      for (int i = 0; i < canciones.size(); i++) {
         if (canciones.get(i).getDate().getYear() == fecha) {
            anio.add(canciones.get(i));
            System.out.println(canciones.get(i).getTittle());
         }
      }
      return anio;
   }

   // Metodo para listar canciones por fecha de publicción
   public ArrayList<Cancion> ordenarPorFecha(ArrayList<Cancion> cancions) {
      Collections.sort(cancions, new Biblioteca(canciones, albums));
      for (int i = 0; i < cancions.size(); i++) {
         System.out.println(cancions.get(i).getTittle() + "------" + cancions.get(i).getDate());
      }
      return cancions;
   }

   // Metodo para listar canción por duración
   public ArrayList<Cancion> ordenarPorDuracion(ArrayList<Cancion> cancions) {
      Collections.sort(cancions);
      for (int i = 0; i < cancions.size(); i++) {
         System.out.println(cancions.get(i).getTittle() + "------" + cancions.get(i).getDuration());
      }
      return cancions;
   }

   /**
    * 
    * @return Lista con albums
    */
   public ArrayList<Album> getAlbums() {
      return albums;
   }

   /**
    * 
    * @param albums
    */

   public void setAlbums(ArrayList<Album> albums) {
      this.albums = albums;
   }

   /**
    * 
    * @return Lista con canciones
    */
   public ArrayList<Cancion> getCanciones() {
      return canciones;
   }

   /**
    * 
    * @param canciones
    */
   public void setCanciones(ArrayList<Cancion> canciones) {
      this.canciones = canciones;
   }

   /**
    * Metodo para sobreescribir canciones por fecha de publicación
    */
   @Override
   public int compare(Cancion o1, Cancion o2) {
      return o1.getDate().compareTo(o2.getDate());
   }
}
