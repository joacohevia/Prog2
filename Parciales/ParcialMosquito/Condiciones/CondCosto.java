package ParcialMosquito.Condiciones;

import ParcialMosquito.Elemento;

public class CondCosto extends Condicion{
    private int costo;

    public CondCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public boolean cumple(Elemento comida) {
        return comida.getPrecio() < costo;
        
    }
    
    
}
