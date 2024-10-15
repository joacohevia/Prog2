package Tp9.Aseguradora.Condiciones;


import Tp9.Aseguradora.Ssimple;

public class CondAnd extends Condicion{
    Condicion c1, c2;

    public CondAnd(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }
    @Override
    public boolean cumple(Ssimple ss) {
        return c1.cumple(ss) && c2.cumple(ss);
    }
    
}
