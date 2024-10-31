package ParcialMosquito;

import java.util.ArrayList;

import ParcialMosquito.Condiciones.Condicion;

public abstract class Elemento {
    private String nombre;

    public Elemento(String nombre) {
        this.nombre = nombre;
    }
    public abstract int getTiempo();
    public abstract int getPrecio();
    public abstract int getCalorias();
    public abstract ArrayList <String> getIngredientes();//en comida retorno
    //copia de la lista y en compuesto verifico que no este repetido
    public abstract ArrayList<Elemento> buscar(Condicion condicion);



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
}
