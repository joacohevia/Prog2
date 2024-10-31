package Parcial2024;

import java.util.Comparator;

public class ComparatorCitas implements Comparator<Elemento> {
    @Override
    public int compare(Elemento o1, Elemento o2) {
        return Integer.compare(o2.getCantidadCitas(), o1.getCantidadCitas()); // Mayor cantidad de citas primero
    }
}

