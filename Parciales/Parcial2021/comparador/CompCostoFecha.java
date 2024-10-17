package comparador;

import java.util.Comparator;

import Parcial2021.PaqViaje;

public class CompCostoFecha implements Comparator<PaqViaje>{

    @Override
    public int compare(PaqViaje o1, PaqViaje o2) {
        int cc = Double.compare(o2.getCosto(),o1.getCosto());
        if (cc != 0) {
            return cc;
        }
        if (o1.getFecha() == null && o2.getFecha() == null) {
            return 0;
        }else if (o1.getFecha() == null){
            return 1;
        }else if (o2.getFecha() == null) {
            return -1;
        }
        return o1.getFecha().compareTo(o2.getFecha());
    }
    
}
