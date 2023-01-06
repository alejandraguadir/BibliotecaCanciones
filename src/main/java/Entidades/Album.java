package Entidades;

import java.util.ArrayList;

public class Album {

    private int id;
    private String nombre;
    private ArrayList<Cancion> canciones;

    public Album(int id, String nombre, ArrayList<Cancion> canciones) {
        this.id = id;
        this.nombre = nombre;
        this.canciones = canciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
}
