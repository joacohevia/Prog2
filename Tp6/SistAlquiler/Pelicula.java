package Tp6.SistAlquiler;

import java.time.LocalDate;

public class Pelicula extends Alquilar{
    private String titulo;
    private String genero;
    private int anio;
    private int copias;
    
    public Pelicula(String titulo, String genero, int anio, int copias,LocalDate fecha) {
        super(fecha);
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.copias = copias;
    }
    @Override
    public boolean estaDisponible() {
        if (this.getCopias()>0) {
            copias--;
            return true;
        }
        return false; 
    }
    
    public void alquilarCopia() {
       
    }
    public String toString() {
        return "Película: " + getTitulo() + " (Copias disponibles: " + getCopias() + ")";
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public int getCopias() {
        return copias;
    }
    public void setCopias(int copias) {
        this.copias = copias;
    }

   

    
}
