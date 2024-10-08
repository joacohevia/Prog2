package Vivero.Condiciones;

import Vivero.Planta;

public class CondSolMayor extends Condicion{
    private int nivelSol;//lo puedo hacer con valores fijos tambien
    private int nivelAgua;

    public CondSolMayor(int ns,int na){
        nivelSol = ns;
        nivelAgua = na;//aca no llamaria para que me pasen valores, los iniciaria yo con los val PEDIDOS
    }
    @Override
    public boolean cumple(Planta planta) {
        return planta.getRequerimientoSol() > nivelSol && planta.getRequerimientoAgua() < nivelAgua;
    }
    
}
