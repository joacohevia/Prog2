package Parcialito.Preferencias;

import Parcialito.Cancion;

public class PreferenciaAnd extends Preferencia {
    private Preferencia pf1, pf2;

    public PreferenciaAnd(Preferencia pp1, Preferencia pp2){
        pf1 = pp1;
        pf2 = pp2;
    }

    public boolean cumple(Cancion cc){
        return pf1.cumple(cc) && pf2.cumple(cc);
    }
}
