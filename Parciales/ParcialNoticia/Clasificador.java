package ParcialNoticia;

import java.util.ArrayList;

import ParcialNoticia.CondicionesNot.CondicionNot;
public class Clasificador {
    private ArrayList <String> palAgregar;
    private CondicionNot cond;
    
    public Clasificador(CondicionNot cond) {
        this.cond = cond;
        this.palAgregar = new ArrayList<>();
    }
// si la not cumple con la condicion (contiene palabra futbol)
//recorro las pal de clasificador y las agrego a las palabras clave de not
    public void clasificar(Noticia not){
        if (cond.cumple(not)) {
            for (String pal : palAgregar) {
                not.addPalClave(pal); 
            }
        }
    }

    public boolean equals(Object o){
        Clasificador cc =  (Clasificador) o;
        try { return this.cond.equals(cc.cond);
        } catch (Exception e) {
            return false;
        }
    }
    
}
