package Futbol5;

import java.util.Comparator;

public class ComparadorId implements Comparator<Socio>{
    private int id=13;
    @Override
    public int compare(Socio o1, Socio o2) {
        return Integer.compare(o2.getCantidadAlquileres(id),o1.getCantidadAlquileres(id));//de mayor a menor
        //return Integer.compare(o1.getCantidadAlquileres(id),o2.getCantidadAlquileres(id));//de menor a mayor
    }
    
}
