package cond;

import Parcial2021.PaqViaje;

public class CondCosto extends condicion{
    private double costo;
    public CondCosto(double cc){
        costo=cc;
    }

    @Override
    public boolean cumple(PaqViaje pv) {
        return pv.getCosto() > costo;
    }
    
}
