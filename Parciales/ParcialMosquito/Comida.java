package ParcialMosquito;

import java.util.ArrayList;

import ParcialMosquito.Condiciones.Condicion;

public class Comida extends Elemento{
    private int tiempo;
    private int precio;
    private int calorias;
    private ArrayList <String> ingredientes;

    public Comida(String nombre, int tiempo, int precio, int calorias) {
        super(nombre);
        this.tiempo = tiempo;
        this.precio = precio;
        this.calorias = calorias;
        this.ingredientes = new ArrayList<>();
    }
    public void addIngredientes(String ss){
        if (!ingredientes.contains(ss.toLowerCase())) {
            ingredientes.add(ss.toLowerCase());
        }
    }
    @Override
    public ArrayList<String> getIngredientes() {
        ArrayList <String> salida = new ArrayList<>();
        for (String ing : ingredientes) {
            salida.add(ing);
        }
        return salida;
    }

    @Override
    public String toString() {
        return "Comida = "+ super.getNombre() +"[tiempo=" + tiempo + ", precio=" + precio + ", calorias=" + calorias + ", ingredientes="
                + ingredientes + "]";
    }
    @Override
    public ArrayList<Elemento> buscar(Condicion condicion) {
        ArrayList <Elemento> salida = new ArrayList<>();
        if (condicion.cumple(this)) {
            salida.add(this);
        }
        return salida;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public int getTiempo() {
        return tiempo;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public int getCalorias() {
        return calorias;
    }

 
    
}
