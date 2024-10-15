package Streaming;

import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private String sipnosis;
    private String generos;
    private String director;
    private ArrayList <String> actores;
    private int anio;
    private int duracionMin;
    private int edadMinima;

    
    public Pelicula(String titulo, String sipnosis, String generos, String director, int anio, int duracionMin,
            int edadMinima) {
        this.titulo = titulo;
        this.sipnosis = sipnosis;
        this.generos = generos;
        this.director = director;
        this.anio = anio;
        this.duracionMin = duracionMin;
        this.edadMinima = edadMinima;
        this.actores = new ArrayList<>();
    }
    public void addActores(String act){
        if (!actores.contains(act.toLowerCase())) {
            actores.add(act.toLowerCase());
        }
    }
    public ArrayList<String> getActores() {
        return actores;
    }
    public boolean buscarActor(String act){
        return this.actores.contains(act.toLowerCase());
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getSipnosis() {
        return sipnosis;
    }
    public void setSipnosis(String sipnosis) {
        this.sipnosis = sipnosis;
    }
    public String getGeneros() {
        return generos;
    }
    public void setGeneros(String generos) {
        this.generos = generos;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public int getDuracionMin() {
        return duracionMin;
    }
    public void setDuracionMin(int duracionMin) {
        this.duracionMin = duracionMin;
    }
    public int getEdadMinima() {
        return edadMinima;
    }
    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }
    @Override
    public String toString() {
        return "Pelicula [titulo=" + titulo + ", sipnosis=" + sipnosis + ", generos=" + generos + ", director="
                + director + ", actores=" + actores + ", anio=" + anio + ", duracionMin=" + duracionMin
                + ", edadMinima=" + edadMinima + "]";
    }

    
}
