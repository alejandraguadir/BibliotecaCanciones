package Entidades;
import java.awt.image.BufferedImage;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;
/**
 * Representa la clase Cancion
 */
public class Cancion implements Comparable<Cancion> {
    //Atributos clase canción
    private int id;
    private String tittle;
    private LocalDate date;
    private float duration;
    private  String gender;
    private BufferedImage cover;
    private String descripiton;

    //Método contructor clase Cancion
    public Cancion(int id, String tittle, LocalDate date, float duration, String gender, BufferedImage cover, String descripiton) {
        this.id = id;
        this.tittle = tittle;
        this.date = date;
        this.duration = duration;
        this.gender = gender;
        this.cover = cover;
        this.descripiton = descripiton;
    }
    //Consultores y modificadores clase Cancion
    /**
     * Retorna objeto cancion por Id
     * @return int que representa Id
     * @see #getId()
     */
    public int getId() {
        return id;
    }

   /**
    * @param id
    */
    public void setId(int id) {
        this.id = id;
    }
      /**
     * Retorna objeto cancion por titulo
     * @return string que representa Tittle
     * @see #getTittle()
     */
    public String getTittle() {
        return tittle;
    }
    /**
     * 
     * @param tittle
     */
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

      /**
     * Retorna objeto cancion por Date
     * @return date que representa fecha
     * @see #getDate()
     */
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

      /**
     * Retorna objeto cancion por Duration
     * @return float que representa tiempo de duración del objeto cancion
     * @see #getDuration()
     */
    public float getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     */
    public void setDuration(float duration) {
        this.duration = duration;
    }

      /**
     * Retorna objeto cancion por Genero del objeto cancion
     * @return String que representa genero
     * @see #getGender()
     */
    public String getGender() {
        return gender;
    }
    /**
     * 
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

      /**
     * Retorna objeto cancion por cover
     * @return BufferedImage que representa Cover
     * @see #getCover()
     */
    public BufferedImage getCover() {
        return cover;
    }
    /**
     * 
     * @param cover
     */
    public void setCover(BufferedImage cover) {
        this.cover = cover;
    }

      /**
     * Retorna objeto cancion por descripción
     * @return String que representa Descripción 
     * @see #getDescription()
     */
    public String getDescripiton() {
        return descripiton;
    }
    /**
     * 
     * @param descripiton
     */
    public void setDescripiton(String descripiton) {
        this.descripiton = descripiton;
    }

    //Sobreescritura del metodo compareTo, metodo para filtrar el objeto cancion por tiempo de duración.
    @Override
    public int compareTo(Cancion o) {
        if(o.getDuration()>duration){
            return -1;
        }else if(o.getDuration()>duration) {
           return 0;
        }else {
            return 1;
        }
    }
}
