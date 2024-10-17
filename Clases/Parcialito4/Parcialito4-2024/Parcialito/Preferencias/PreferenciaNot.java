package Parcialito.Preferencias;

import Parcialito.Cancion;

public class PreferenciaNot extends Preferencia {
    private Preferencia pf1;

    public PreferenciaNot(Preferencia pp1){
        pf1 = pp1;
    }

    public boolean cumple(Cancion cc){
        return !pf1.cumple(cc);
    }
}
