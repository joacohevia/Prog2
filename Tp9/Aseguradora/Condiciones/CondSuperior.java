package Tp9.Aseguradora.Condiciones;

import Tp9.Aseguradora.Ssimple;

public class CondSuperior extends Condicion{
    private double monto;
    public CondSuperior(double mon){
        this.monto = mon;
    }
    @Override
    public boolean cumple(Ssimple ss) {
        return ss.getMonto() > this.monto;
    }
    
}
