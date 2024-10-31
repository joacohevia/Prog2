package Parcial2024;

import java.util.Comparator;

public class ComparadorInves implements Comparator<Elemento> {
    @Override
    public int compare(Elemento o1, Elemento o2) {
        return Integer.compare(o2.getCantidadInvestigaciones(), o1.getCantidadInvestigaciones()); // Mayor cantidad primero
    }
}
