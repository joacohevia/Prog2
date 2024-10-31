package ParcialSIS;

import java.util.ArrayList;

public class Paciente {
    private String nombre;
    private int edad;
    private ArrayList <String> sintomas;
    private ArrayList <String> equipoNecesario;

    
    public Paciente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.sintomas = new ArrayList<>();
        this.equipoNecesario = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    
}
