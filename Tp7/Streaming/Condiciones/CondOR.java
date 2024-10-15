package Streaming.Condiciones;

import Streaming.Pelicula;

public class CondOR extends Condicion{
    private Condicion c1;
    private Condicion c2;
    public CondOR(Condicion cc,Condicion cc2){
        c1 = cc;
        c2 = cc2;
    }
    @Override
    public boolean cumple(Pelicula pel) {
        return c1.cumple(pel) || c2.cumple(pel);
    }
    
}
