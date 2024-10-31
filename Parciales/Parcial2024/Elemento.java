package Parcial2024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Parcial2024.CondicionesInves.CondicionInves;

public abstract class Elemento {

    public abstract int getRelevancia();
    public abstract ArrayList<Investigador> buscar(CondicionInves cc);
    public abstract int getEdad();


    public abstract int getCantidadInvestigaciones();
    public abstract int getCantidadCitas();
    public ArrayList <Elemento> getRaikingOrden(Comparator<Elemento>orden){
        ArrayList <Elemento> resp = getInvestigadores();
        Collections.sort(resp, orden);
        return resp;
    }
    public abstract ArrayList<Elemento> getInvestigadores();

}
