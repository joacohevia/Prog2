package Parcialito4;

import Parcialito4.CriteriosDeBusqueda.Criterio;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Producto>productos;

    public Empresa() {
        this.productos = new ArrayList<>();
    }

    public void addProducto(Producto nuevo){
        if(!productos.contains(nuevo))
            productos.add(nuevo);
    }

    public ArrayList<Producto> busqueda(Criterio criterio) {
        ArrayList<Producto> resultado = new ArrayList<>();
        for (Producto p : productos){
            if(criterio.cumple(p)){
                resultado.add(p);
            }
        }
        return resultado;
    }

}
