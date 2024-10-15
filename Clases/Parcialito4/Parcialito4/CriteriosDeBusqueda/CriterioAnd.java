package Parcialito4.CriteriosDeBusqueda;

import Parcialito4.Producto;

public class CriterioAnd extends Criterio{
    Criterio c1;
    Criterio c2;

    public CriterioAnd(Criterio c1, Criterio c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Producto pp) {
        return c1.cumple(pp) && c2.cumple(pp);
    }
}
