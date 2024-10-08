package Vivero.Condiciones;

import Vivero.Planta;

public class CondNomVulgar extends Condicion{
    private String nombreBuscado;

    public CondNomVulgar(){
        this.nombreBuscado = "lengua de suegra";
    }
    @Override
    public boolean cumple(Planta planta) {
        return planta.tieneNomVulgar(nombreBuscado);
    }
    
}
