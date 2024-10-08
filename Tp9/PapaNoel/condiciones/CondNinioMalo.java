package PapaNoel.condiciones;

import PapaNoel.Carta;

public class CondNinioMalo extends Condicion{

    @Override
    public boolean cumple(Carta cc) {
        return cc.getRegalos().contains("Trozo de carbon");
    }
    
}
