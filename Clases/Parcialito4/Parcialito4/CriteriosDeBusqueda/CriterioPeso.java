package Parcialito4.CriteriosDeBusqueda;

import Parcialito4.Producto;

public class CriterioPeso extends Criterio{
    int peso;

    public CriterioPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public boolean cumple(Producto pp) {
        return pp.getPeso()<peso;
    }
}
