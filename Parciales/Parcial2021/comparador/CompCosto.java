package comparador;

import java.util.Comparator;

import Parcial2021.PaqViaje;

public class CompCosto implements Comparator<PaqViaje>{

    @Override
    public int compare(PaqViaje o1, PaqViaje o2) {
        //return Double.compare(o1.getCosto(),o2.getCosto());
        return Double.compare(o2.getCosto(),o1.getCosto());
    }
    
}
