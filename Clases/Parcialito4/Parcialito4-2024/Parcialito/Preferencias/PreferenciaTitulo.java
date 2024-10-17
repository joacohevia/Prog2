package Parcialito.Preferencias;

import Parcialito.Cancion;

public class PreferenciaTitulo extends Preferencia {
    private String palabra_contenida;

    public PreferenciaTitulo(String pc){
        palabra_contenida = pc;
    }

    public boolean cumple(Cancion cc){
        // Si el titulo contiene la palabra.
        return cc.getTitulo().contains(palabra_contenida);
    }
}
