package Parcialito.Preferencias;

import java.time.LocalDate;

import Parcialito.Cancion;

public class PreferenciaFechaPosterior extends Preferencia {
    private LocalDate fecha_anterior;

    public PreferenciaFechaPosterior(LocalDate fa){
        fecha_anterior = fa;
    }

    public boolean cumple(Cancion cc){
        // Si la fecha de la cancion esta luego de una fecha anterior.
        return cc.getLanzamiento().isAfter(fecha_anterior);
    }
}
