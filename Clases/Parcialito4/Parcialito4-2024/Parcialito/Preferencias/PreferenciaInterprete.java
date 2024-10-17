package Parcialito.Preferencias;

import Parcialito.Cancion;

public class PreferenciaInterprete extends Preferencia {
    private String interprete_buscado;

    public PreferenciaInterprete(String ib){
        interprete_buscado = ib;
    }

    public boolean cumple(Cancion cc){
        // NO es necesario cambiar el equals la clase String ya tienen un equal por defecto.
        return cc.getInterprete().equals(interprete_buscado);
    }
}
