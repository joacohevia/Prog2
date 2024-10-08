package BusqDoc;

import java.util.ArrayList;

public class Documento {
    private String titulo;
    private String contenido;
    private ArrayList <String> autores;
    private ArrayList <String> palabrasClave;

    
    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.autores = new ArrayList<>();
        this.palabrasClave = new ArrayList<>();
    }
    public void addAutores(String aut){
        if (!autores.contains(aut.toLowerCase())) {
            autores.add(aut.toLowerCase());
        }
    }
    public boolean CantidadPalContenido(int cant){
        // Divide el contenido en palabras utilizando espacios como delimitador
        String[] palabras = contenido.trim().split("\\s+");
         // "\\s+" considera uno o más espacios en blanco
        return palabras.length >= cant;
    }
    public void addPalabras(String pal){
        if (!palabrasClave.contains(pal.toLowerCase())) {
            palabrasClave.add(pal.toLowerCase());
        }
    }
    public boolean tieneAutor(String nombre){
        return autores.contains(nombre.toLowerCase());
    }

    public boolean tienePalClave(String pal){
        return palabrasClave.contains(pal.toLowerCase());
    }
    public boolean tieneClave(){
        return palabrasClave.isEmpty();
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
    public String toString(){
        return "Titulo: "+getTitulo()+" Contiene: "+getContenido()+" Pal claves: "+palabrasClave;
    }    
}
