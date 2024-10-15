package Streaming.Condiciones;

import Streaming.Pelicula;

public class CondNot extends Condicion{
    private Condicion c1;
    public CondNot(Condicion cc){
        c1=cc;
    }
    @Override
    public boolean cumple(Pelicula pel) {
        return !c1.cumple(pel);
    }
    
}
