package Parcialito.Preferencias;

import Parcialito.Cancion;

public class PreferenciaGeneros extends Preferencia {
    private String genero_buscado;

    public PreferenciaGeneros(String gb){
        genero_buscado = gb;
    }

    public boolean cumple(Cancion cc){
        // Si contiene el genero buscado.
        return cc.getGeneros().contains(genero_buscado);
    }
}
