package Entidades;
import java.awt.image.BufferedImage;
import java.text.DateFormat;

public class Cancion {

    private int id;
    private String tittle;
    private DateFormat date;
    private float duration;
    private  String gender;
    private BufferedImage cover;
    private String descripiton;

    public Cancion(int id, String tittle, DateFormat date, float duration, String gender, BufferedImage cover, String descripiton) {
        this.id = id;
        this.tittle = tittle;
        this.date = date;
        this.duration = duration;
        this.gender = gender;
        this.cover = cover;
        this.descripiton = descripiton;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public DateFormat getDate() {
        return date;
    }

    public void setDate(DateFormat date) {
        this.date = date;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public BufferedImage getCover() {
        return cover;
    }

    public void setCover(BufferedImage cover) {
        this.cover = cover;
    }

    public String getDescripiton() {
        return descripiton;
    }

    public void setDescripiton(String descripiton) {
        this.descripiton = descripiton;
    }
}
