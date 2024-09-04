package Tp3.JuegoPersonajes;

import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private String apellido;
    private ArrayList<Jugador> judadores;


    public Jugador(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.judadores = new ArrayList<>();
    }

    public void agregarJug(Jugador j){
        this.judadores.add(j);
    }
    public ArrayList<Jugador> getJudadores() {
        return judadores;
    }
    public void setJudadores(ArrayList<Jugador> judadores) {
        this.judadores = judadores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre() {
        return nombre;
    }
   
    public String getApellido() {
        return apellido;
    }

    
    
}
