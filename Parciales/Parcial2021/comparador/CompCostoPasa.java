package comparador;

import java.util.Comparator;

import Parcial2021.PaqViaje;

public class CompCostoPasa implements Comparator<PaqViaje>{
    public int compare(PaqViaje p1, PaqViaje p2) {
        // Primero comparamos por costo
        int costoComparison = Double.compare(p1.getCosto(), p2.getCosto());
        if (costoComparison != 0) {
            return costoComparison; // Retorna la comparación de costos si no son iguales
        }
        // Si los costos son iguales, comparamos por cantidad de pasajeros
        return Integer.compare(p1.getCantidad(), p2.getCantidad());
    }
}
