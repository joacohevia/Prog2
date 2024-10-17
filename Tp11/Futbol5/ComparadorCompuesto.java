package Futbol5;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Socio>{
    Comparator <Socio> criterio1,criterio2,criterio3;
    public ComparadorCompuesto(Comparator<Socio> ss1, Comparator<Socio> ss2){
        this.criterio1 = ss1;
        this.criterio2 = ss2;        
    }
    @Override
    public int compare(Socio s1, Socio s2) {
        int resultado = criterio1.compare(s1, s2);
        if (resultado == 0) {
            return criterio2.compare(s1, s2);
        }
        return resultado;
    }
}
