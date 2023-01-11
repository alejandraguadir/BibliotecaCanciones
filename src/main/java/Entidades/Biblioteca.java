package Entidades;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Biblioteca implements Comparator<Cancion> {
   private static ArrayList<Cancion> canciones;
   private static ArrayList<Album> albums;

   public Biblioteca(ArrayList<Cancion> canciones, ArrayList<Album> albums){
      this.canciones = canciones;
      this.albums = albums;
   }
   public  void mostrarCanciones(){
      for (int i =0; i<canciones.size();i++){
         System.out.println(canciones.get(i).getTittle());
      }

   }
public  ArrayList cancionesSegunGenero(String gender) {
   ArrayList<Cancion> genero = new ArrayList<>();
   for (int i = 0; i < canciones.size(); i++) {
      if (gender.equals(canciones.get(i).getGender())) {
         genero.add(canciones.get(i));
         System.out.println(canciones.get(i).getTittle());
      }
   }
    return genero;
}
public  ArrayList cancionesSegunAño(int fecha){
   ArrayList<Cancion> anio = new ArrayList<>();
   for (int i = 0; i < canciones.size(); i++){
      if(canciones.get(i).getDate().getYear() == fecha){
         anio.add(canciones.get(i));
         System.out.println(canciones.get(i).getTittle());
      }
   }
   return anio;
}
public ArrayList<Cancion> ordenarPorFecha(ArrayList<Cancion> cancions){
   Collections.sort(cancions, new Biblioteca(canciones,albums));
 for (int i = 0;i<cancions.size();i++){
    System.out.println(cancions.get(i).getTittle() +"------"+ cancions.get(i).getDate());
 }
   return cancions;
   }

   public ArrayList<Cancion> ordenarPorDuracion(ArrayList<Cancion>cancions){
      Collections.sort(cancions);
       for (int i = 0;i<cancions.size();i++){
           System.out.println(cancions.get(i).getTittle() +"------"+ cancions.get(i).getDuration());
       }
       return cancions;
   }
   public ArrayList<Album> getAlbums() {
      return albums;
   }

   public void setAlbums(ArrayList<Album> albums) {
      this.albums = albums;
   }

   public ArrayList<Cancion> getCanciones() {
      return canciones;
   }

   public void setCanciones(ArrayList<Cancion> canciones) {
      this.canciones = canciones;
   }
   @Override
   public int compare(Cancion o1, Cancion o2) {
      return o1.getDate().compareTo(o2.getDate());
   }
}
