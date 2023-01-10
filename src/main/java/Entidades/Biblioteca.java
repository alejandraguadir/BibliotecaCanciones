package Entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Biblioteca {
   private ArrayList<Cancion> canciones;
   private ArrayList<Album> albums;

   public Biblioteca(ArrayList<Cancion> canciones, ArrayList<Album> albums) {
      this.canciones = canciones;
      this.albums = albums;
   }
public ArrayList cancionesSegunGenero(String gender) {
   ArrayList<Cancion> genero = new ArrayList<>();
   for (int i = 0; i < canciones.size(); i++) {
      if (gender.equals(canciones.get(i).getGender())) {
         genero.add(canciones.get(i));
      }
   }
    return genero;
}
public ArrayList cancionesSegunAño(LocalDate fecha){
   ArrayList<Cancion> anio = new ArrayList<>();
   for (int i = 0; i < canciones.size(); i++){
      System.out.println("jdjjd");
      if(canciones.get(i).getDate().getYear() == fecha.getYear()){

         anio.add(canciones.get(i));
      }
   }
   return anio;
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

}
