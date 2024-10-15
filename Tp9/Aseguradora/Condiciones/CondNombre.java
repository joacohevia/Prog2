package Tp9.Aseguradora.Condiciones;

import Tp9.Aseguradora.Ssimple;

public class CondNombre extends Condicion{
    private String buscado;
    public CondNombre(String nombre){
        buscado = nombre;
    }
    @Override
    public boolean cumple(Ssimple ss) {
        return ss.getDescripcion().equals(buscado);
    }
    
}
