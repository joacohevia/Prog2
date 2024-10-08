package Vivero;

import java.util.ArrayList;

import Vivero.Condiciones.Condicion;

public class AdminVivero {
    private ArrayList <Planta> plantas;

    public AdminVivero(){
        this.plantas = new ArrayList<>();
    }
    public void addPlantas(Planta plant){
        if (!plantas.contains(plant)) {
            plantas.add(plant);
        }
    }
    public ArrayList <Planta> buscar (Condicion con){
        ArrayList <Planta> salida = new ArrayList<Planta>();
        for (int i = 0; i < plantas.size(); i++) {
            Planta p = plantas.get(i);
            if (con.cumple(p)) {
                salida.add(p);
            }
        }
        return salida;
    }
}
