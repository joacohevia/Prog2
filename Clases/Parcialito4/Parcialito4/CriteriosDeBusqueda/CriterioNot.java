package Parcialito4.CriteriosDeBusqueda;

import Parcialito4.Producto;

public class CriterioNot extends Criterio{
    Criterio not;

    public CriterioNot(Criterio not) {
        this.not = not;
    }


    @Override
    public boolean cumple(Producto pp) {
        return !not.cumple(pp);
    }
}
