package ParcialNoticia;
import java.util.ArrayList;

import ParcialNoticia.CondicionesNot.CondicionNot;

public class Noticia extends ElementNoticia{
    private String titulo;
    private String contenido;
    private String autor;
    private String categoria;
    private ArrayList <String> palClave;
    private ArrayList <Clasificador> clasificadores;
    
    public Noticia(String titulo, String contenido, String autor, String categoria) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.autor = autor;
        this.categoria = categoria;
        this.palClave = new ArrayList<>();
        this.clasificadores = new ArrayList<>();
    }
    public void addPalClave(String nuevo){
        if (!palClave.contains(nuevo.toLowerCase())) {
            palClave.add(nuevo.toLowerCase());
        }
    }
    public void addClasificador(Clasificador nuevo){
        if (!clasificadores.contains(nuevo)) {//definir equals
            clasificadores.add(nuevo);
        }
    }
    public void clasificar(Noticia nn){
        for (Clasificador clasi : clasificadores) {
            clasi.clasificar(nn);
        }
    }
    public ArrayList<Noticia> buscar(CondicionNot cc){
        ArrayList <Noticia> respuesta = new ArrayList<>();
        if (cc.cumple(this)) {
            respuesta.add(this);
        }
        return respuesta;
    }
    public ArrayList <String> getPalClave(){
        ArrayList <String> aux = new ArrayList<>();
        aux.addAll(palClave);
        return aux;
    }
    public String getCategoria() {
        return categoria;
    }


    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
