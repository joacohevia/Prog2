package CandyCrush;

import java.util.ArrayList;

import CandyCrush.Condiciones.Condicion;

public class Tablero {
    private ArrayList <Ficha> fichas;
    private int puntaje;
    private double dificultad=0;
    
    public Tablero(int puntaje) {
        this.puntaje = puntaje;
        this.fichas = new ArrayList<>();
    }
    public void CalcularDificultad() {
        double suma = 0;
        double totalFortaleza = calcFort();
        double totalDestruccion = calcDestruc();
        if (totalDestruccion == 0) {
            this.dificultad = suma;
        }
        this.dificultad = totalFortaleza / totalDestruccion;
    }
    //voy recorriendo el array y que vaya sumando fortalezas y otra funcion que sume destruc
    public double calcFort(){
        double suma=0;
        for (Ficha ficha : fichas) {
            suma += ficha.getFortaleza();
        }
        return suma;
    }
    public double calcDestruc(){
        double suma = 0;
        for (int i = 0; i < fichas.size(); i++) {
            double destruc = fichas.get(i).getDestruccion();
            suma += destruc;
        }
        return suma;
    }
    public void addFicha(Ficha fic){
        if (!fichas.contains(fic)) {
            fichas.add(fic);
        }
    }

    public int getPuntaje() {
        return puntaje;
    }
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    public double getDificultad() {
        return dificultad;
    }
    @Override
    public String toString() {
        return "--Tablero fichas=" + fichas + ", puntaje=" + puntaje + ", dificultad=" + dificultad + "--";
    }
   public ArrayList <Ficha> buscar (Condicion con){
        ArrayList <Ficha> salida = new ArrayList<Ficha>();
        for (int i = 0; i < fichas.size(); i++) {
            Ficha p = fichas.get(i);
            if (con.cumple(p)) {
                salida.add(p);
            }
        }
        return salida;
    }

    
}
