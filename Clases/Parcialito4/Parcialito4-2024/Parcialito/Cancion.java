package Parcialito;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cancion {
    private String interprete;
    private String titulo;
    private ArrayList<String> generos;
    private LocalDate lanzamiento;

    
    public Cancion(String interprete, String titulo, LocalDate lanzamiento) {
        this.interprete = interprete;
        this.titulo = titulo;
        this.lanzamiento = lanzamiento;
        this.generos = new ArrayList<>();
    }

    public ArrayList<String> getGeneros(){
        ArrayList<String> salida = new ArrayList<>();
        salida.addAll(generos);
        return salida;
    }

    public void addGenero(String gg){
        this.generos.add(gg);
    }

    public String getInterprete() {
        return interprete;
    }
    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public LocalDate getLanzamiento() {
        return lanzamiento;
    }
    public void setLanzamiento(LocalDate lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    
}
