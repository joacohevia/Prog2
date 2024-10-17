package Futbol5;

import java.util.Comparator;

public class ComparadorEdad implements Comparator<Socio>{

    @Override
    public int compare(Socio o1, Socio o2) {
        return Integer.compare(o1.getEdad(), o2.getEdad());
    }
    
}
