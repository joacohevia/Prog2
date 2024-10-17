package cond;

import Parcial2021.PaqViaje;

public class CondAnd extends condicion{
    condicion c1, c2;

    public CondAnd(condicion c1, condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }
    @Override
    public boolean cumple(PaqViaje pv) {
        return c1.cumple(pv) && c2.cumple(pv);
    }
    
}
