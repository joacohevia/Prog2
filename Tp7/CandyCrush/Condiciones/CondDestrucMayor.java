package CandyCrush.Condiciones;

import CandyCrush.Ficha;

public class CondDestrucMayor extends Condicion{
    private int buscado;

    public CondDestrucMayor(){
        this.buscado =2;
    }
    public CondDestrucMayor(int b){
        this.buscado = b;
    }
    @Override
    public boolean cumple(Ficha f) {
        return f.getDestruccion() > buscado;
    }
    
}
