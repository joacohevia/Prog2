package comparador;
import java.util.Comparator;

import Parcial2021.PaqViaje;


public class CompCiudadOrigen implements Comparator<PaqViaje> {
    public int compare(PaqViaje p1, PaqViaje p2){
        int dest = p1.getOrigen().compareTo(p2.getOrigen());
        if (dest !=0) {
            return dest;
        }
        return p1.getId() - p2.getId();  //Integer.compare(p1.getId(), p2.getId());
    }
}
