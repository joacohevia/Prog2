package Parcial2024;

import java.util.Comparator;

public class CompRelevancia  implements Comparator<Elemento>{
     //Comparator por Relevancia Dividida por Edad (Investigador Joven):
    @Override
    public int compare(Elemento o1, Elemento o2) {
        double relevanciaPorEdad1 = (double) o1.getRelevancia() / o1.getEdad();
        double relevanciaPorEdad2 = (double) o2.getRelevancia() / o2.getEdad();
        return Double.compare(relevanciaPorEdad2, relevanciaPorEdad1); // Mayor relevancia por edad primero
    }

}
