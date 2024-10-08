package Personajes;
import java.util.ArrayList;

public class Barco extends Elemento{
    private ArrayList <Elemento> personajesBarco;

    public Barco(String nombre) {
        super(nombre);
        this.personajesBarco = new ArrayList<>();
    }
    public void addPersonBarco(Elemento bb){
        this.personajesBarco.add(bb);
    }
    @Override
    public int fuerza() {
       int result = 0;
       if (tieneElementos()) {
            for (Elemento per : personajesBarco) {
                result += per.fuerza();
            }
       }
       return result;
    }
    public boolean tieneElementos(){
        return !personajesBarco.isEmpty();
    }

    public int peso(){
        int peso=0;
        if (tieneElementos()) {
            peso = personajesBarco.get(0).peso();
        }
        return peso;
    }
    @Override
    public String toString() {
        return "Barco "+nombre +" edad "+edad()+" peso: "+peso()+" fuerza: "+fuerza();
    }
    public int edad(){
        int mayor=0;
        if (tieneElementos()) {
            for (Elemento personaje : personajesBarco) {
                if (personaje.edad()>mayor) {
                    mayor = personaje.edad();
                }
            }
        }
        return mayor;
    }
 

}
