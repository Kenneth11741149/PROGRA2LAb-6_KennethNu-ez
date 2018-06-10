package lab6_kennethnuñez;

import java.util.ArrayList;


public class Series {
    private String id;
    private String nombre;
    private int numtemporadas;
    private String categoria;
    private ArrayList<String> idiomas = new ArrayList();
    private ArrayList<String> subtitulos = new ArrayList();
    private String duracion;
    private int rating;
    private ArrayList<String> comentarios = new ArrayList();
    private String productora;
    private String director;
    private ArrayList<String> actores = new ArrayList();

    public Series(String id, String nombre, int numtemporadas, String categoria, String duracion, int rating, String productora, String director) {
        this.id = id;
        this.nombre = nombre;
        this.numtemporadas = numtemporadas;
        this.categoria = categoria;
        this.duracion = duracion;
        this.rating = rating;
        this.productora = productora;
        this.director = director;
    }

    public Series() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumtemporadas() {
        return numtemporadas;
    }

    public void setNumtemporadas(int numtemporadas) {
        this.numtemporadas = numtemporadas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<String> idiomas) {
        this.idiomas = idiomas;
    }

    public ArrayList<String> getSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(ArrayList<String> subtitulos) {
        this.subtitulos = subtitulos;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<String> getActores() {
        return actores;
    }

    public void setActores(ArrayList<String> actores) {
        this.actores = actores;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
    
}
