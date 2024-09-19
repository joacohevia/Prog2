package Tp5.CooAgricultores;

import java.util.ArrayList;

public class Cereal {
    private String nombre;
    private ArrayList<String> mineralesRequeridos;
    private final String PASTURA= "PASTURA";
    
    public Cereal(String nombre) {
        this.setNombre(nombre);
        this.mineralesRequeridos = new ArrayList<>();
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }
    public String getNombre() {
        return nombre;
    }
    
    public void addMineralRequerido(String mineral) {
        this.mineralesRequeridos.add(mineral.toUpperCase());
    }

    public ArrayList<String> getMineralesRequeridos() {
        return mineralesRequeridos;
    }
    public boolean esPastura(){
        if (this.getNombre().equals(PASTURA)) {
            return true;
        }
        return false;
    }

    public boolean requiereMineral(String mineral) {
        return mineralesRequeridos.contains(mineral.toUpperCase());
    }

    @Override
    public String toString() {
        return "Cereal [getNombre()=" + getNombre() + ", getMineralesRequeridos()=" + getMineralesRequeridos() + "]";
    }

    
}
