package Parcialito4.CriteriosDeBusqueda;

import Parcialito4.Producto;

public class CriterioAnio extends Criterio{
    private int anio;

    public CriterioAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean cumple(Producto pp) {
        return pp.getAnioFabricacion()<anio;
    }
}
