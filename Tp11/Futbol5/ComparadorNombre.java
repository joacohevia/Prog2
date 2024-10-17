package Futbol5;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<Socio> {
    @Override
    public int compare(Socio s1, Socio s2) {
        int apellidoComp = s1.getApellido().compareTo(s2.getApellido());
        if (apellidoComp != 0) {
            return apellidoComp;
        }
        return s1.getNombre().compareTo(s2.getNombre());
    }
}