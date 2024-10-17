package Futbol5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Club {
    private ArrayList <Socio> socios;

    public Club(){
        socios = new ArrayList<>();
    }
    public ArrayList<Socio> buscarOrdenado(Condicion cc, Comparator<Socio>orden){
        ArrayList <Socio> result = this.buscar(cc);
        Collections.sort(result,orden);
        return result;
    }
    public ArrayList<Socio> buscar(Condicion cc) {
        ArrayList<Socio> resultado = new ArrayList<>();
        for (Socio socio : socios) {
            if (cc.cumple(socio)) {
                resultado.add(socio);
            }
        }
        return resultado;
    }
    public void addSocio(Socio socio) {
        socios.add(socio);
    }
}

