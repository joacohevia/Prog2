package Futbol5;

import java.util.Comparator;

public class ComparadorCuota implements Comparator<Socio>{
    @Override
    public int compare(Socio s1, Socio s2) {
        return Boolean.compare(s2.isPago(), s1.isPago());
    }

}
