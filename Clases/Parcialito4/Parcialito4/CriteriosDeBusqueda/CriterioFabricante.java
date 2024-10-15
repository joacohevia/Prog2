package Parcialito4.CriteriosDeBusqueda;

import Parcialito4.Producto;

public class CriterioFabricante extends Criterio{
    String fabricante;

    public CriterioFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public boolean cumple(Producto pp) {
        return pp.getFabricante().equals(fabricante);
    }
}
