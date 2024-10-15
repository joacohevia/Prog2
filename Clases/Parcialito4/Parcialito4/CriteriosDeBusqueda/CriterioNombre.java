package Parcialito4.CriteriosDeBusqueda;

import Parcialito4.Producto;

public class CriterioNombre extends Criterio{
    private String nombre;

    public CriterioNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(Producto pp) {
        return pp.getNombre().equalsIgnoreCase(nombre);
    }
}
