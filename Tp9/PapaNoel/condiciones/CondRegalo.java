package PapaNoel.condiciones;

import PapaNoel.Carta;

public class CondRegalo extends Condicion{
    private String regalo;

    public CondRegalo(String rr){
        regalo = rr;
    }
    @Override
    public boolean cumple(Carta cc) {
       return cc.tieneRegalo(regalo);
    }
    
}
