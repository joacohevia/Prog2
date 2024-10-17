package cond;

import Parcial2021.PaqViaje;

public class CondDestino extends condicion{
    private String destino;
    public CondDestino(String des){
        destino=des;
    }
    @Override
    public boolean cumple(PaqViaje paq) {
        return paq.getDestino().equals(destino);
    }
    
}
