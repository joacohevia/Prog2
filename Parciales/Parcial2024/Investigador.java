package Parcial2024;

import java.util.ArrayList;

import Parcial2024.CondicionesInves.CondicionInves;

public class Investigador extends Elemento{
    private String nombre;
    private String apellido;
    private int edad;
    private ArrayList <Investigacion> investigaciones;

    public Investigador(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.investigaciones = new ArrayList<>();
    }
    public int getCantidadInvestigaciones() {
        return investigaciones.size();
    }
    
    @Override
    public int getCantidadCitas() {
        int total = 0;
        for (Investigacion inv : investigaciones) {
            total += inv.getCitas();
        }
        return total;
    }    
    @Override
    public int getRelevancia() {
        int total = 0;
        for (Investigacion inves : investigaciones) {
            total += inves.getRelevancia();
        }
        return total;
    }

    @Override
    public ArrayList<Investigador> buscar(CondicionInves cc) {
        ArrayList <Investigador> resp = new ArrayList<>();
        if (cc.cumple(this)) {
            resp.add(this);
        }
        return resp;
    }

    @Override
    public int getEdad() {
        return this.edad;
    }

    @Override
    public ArrayList<Elemento> getInvestigadores() {
       ArrayList <Elemento> resp = new ArrayList<>();
       resp.add(this);
       return resp;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
