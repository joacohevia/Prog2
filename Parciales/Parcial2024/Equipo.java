package Parcial2024;

import java.util.ArrayList;

import Parcial2024.CondicionesInves.CondicionInves;

public class Equipo extends Elemento{
    private ArrayList <Elemento> equipos;

    public Equipo() {
        this.equipos = new ArrayList<>();
    }
    @Override
public int getCantidadInvestigaciones() {
    int total = 0;
    for (Elemento elem : equipos) {
        total += elem.getCantidadInvestigaciones();
    }
    return total;
}

@Override
public int getCantidadCitas() {
    int total = 0;
    for (Elemento elem : equipos) {
        total += elem.getCantidadCitas();
    }
    return total;
}

    @Override
    public int getRelevancia() {
        int total = 0;
        for (Elemento elem : equipos) {
            total += elem.getRelevancia();
        }
        return total;
    }

    @Override
    public ArrayList<Investigador> buscar(CondicionInves cc) {
        ArrayList <Investigador> resp = new ArrayList<>();
        for (Elemento elem:equipos) {
            resp.addAll(elem.buscar(cc));
        }
        return resp;
    }

    @Override
    public int getEdad() {
        int total = 0;
        for (Elemento elemento : equipos) {
            total += elemento.getEdad();
        }
        return total/equipos.size();
    }
    public ArrayList<Elemento> getEquipo(){
        ArrayList <Elemento> aux = new ArrayList<>();
        aux.addAll(equipos);
        return aux;
    }
  
    @Override
    public ArrayList<Elemento> getInvestigadores() {
    ArrayList<Elemento> resp = new ArrayList<>();
    for (Elemento elem : equipos) {
        resp.addAll(elem.getInvestigadores()); // Agregar investigadores individuales
    }
    return resp;
}

}
