package ParcialMosquito;

import java.util.ArrayList;

import ParcialMosquito.Condiciones.Condicion;

public class Cliente {
    private String nombre;
    private ArrayList <Elemento> comidas;
    private int caloriasPerm;
    private Condicion cc;
    
    public Cliente(String nombre, int caloriasPerm, Condicion cc) {
        this.nombre = nombre;
        this.caloriasPerm = caloriasPerm;
        this.cc = cc;
        this.comidas = new ArrayList<>();
    }
    public void addElemento(Elemento ee){
        if (!comidas.contains(ee)) {
            comidas.add(ee);
        }
    }
    public boolean leGusta(Elemento comida){
        if (!comidas.contains(comida)&&cc.cumple(comida)) {
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", comidas=" + comidas + ", caloriasPerm=" + caloriasPerm + "]";
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCaloriasPerm() {
        return caloriasPerm;
    }
    public void setCaloriasPerm(int caloriasPerm) {
        this.caloriasPerm = caloriasPerm;
    }
    public Condicion getCc() {
        return cc;
    }
    public void setCc(Condicion cc) {
        this.cc = cc;
    }

    
}
