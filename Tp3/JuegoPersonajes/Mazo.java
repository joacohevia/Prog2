package Tp3.JuegoPersonajes;
import java.util.ArrayList;
import java.util.Random;

public class Mazo {
    
    private ArrayList<Personaje>personajes;

    public Mazo(){
        this.personajes = new ArrayList<Personaje>();
    }
    public Personaje abarajar() {
        Random random = new Random();
        int num = random.nextInt(personajes.size());// Seleccionar un índice aleatorio dentro del rango válido
        return personajes.get(num);
    }
    public void agregarPersonaje(Personaje p){
        this.personajes.add(p);
    }
    
    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(ArrayList<Personaje> personajes) {
        this.personajes = personajes;
    }
    
}
