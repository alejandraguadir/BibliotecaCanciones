package Entidades;

import java.util.ArrayList;

//Clase que representa Albúm
public class Album {
    // Atributos
    private int id;
    private String nombre;
    private ArrayList<Cancion> canciones;

    // Metodo constructor
    public Album(int id, String nombre, ArrayList<Cancion> canciones) {
        this.id = id;
        this.nombre = nombre;
        this.canciones = canciones;
    }

    /**
     * 
     * @return entero con id de album
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return String con nombre de album
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return lista de canciones por album
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

}
