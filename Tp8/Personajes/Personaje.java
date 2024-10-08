package Personajes;

import java.util.ArrayList;

public class Personaje extends Elemento{
    protected int peso;
    private int edad;
    private int fuerza;
    private ArrayList <Fruta> frutasIngeridas;

    public Personaje(String nombre, int peso, int edad) {
        super(nombre);
        this.peso = peso;
        this.edad = edad;
        this.fuerza = 125;
        this.frutasIngeridas = new ArrayList<>();
    }
    @Override
    public int edad() {
        return getEdad();
    }
    public void ingerir(Fruta ff){
        frutasIngeridas.add(ff);
    }

    @Override
    public String toString() {
        return "Personaje [nombre=" + nombre + ", peso=" + peso + ", edad=" + edad + ", fuerza=" + fuerza;
    }
    @Override
    public int peso() {
        return getPeso();
    }
    
    @Override
    public int fuerza() {
        int fuerza = getFuerza();
        if (!frutasIngeridas.isEmpty()) {
            for (Fruta frut : frutasIngeridas) {
                fuerza += frut.aplicarFuerza(getPeso());
            }
        }
        return fuerza;
    }

    public int getEdad() {
        return edad;
    }
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

   
}
