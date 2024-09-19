
package Congreso8;

import java.util.ArrayList;

public class Evaluador {
    private String nombre;
    private String tipo;
    private ArrayList <String> conocimientos;
    private ArrayList <String> tpAsignados;

    public Evaluador(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
        this.conocimientos = new ArrayList<>();
        this.tpAsignados = new ArrayList<>();
    }
    
    public boolean puedeEvaluar(Trabajo trabajo) {
        if (trabajo.esPoster()) {
            for (String tema : trabajo.getTemasPoster()) {
                if (conocimientos.contains(tema.toLowerCase())) {
                    return true;
                }
            }
        }
        else if(trabajo.esArticulo()) {
            // Para otros trabajos, el evaluador necesita conocer todos los temas
            for (String tema : trabajo.getTemasArticulo()) {
                if (!conocimientos.contains(tema.toLowerCase())) {
                    return false;   
                }
            }
            return true;
        }else{
            if (trabajo.getTemasResumen().size()>0) {
            for (String temas : trabajo.getTemasResumen()) {
                if (!conocimientos.contains(temas.toLowerCase())) {
                    return false;
                }
            }
            return true;
            }
        }
        return false;
    }
    public void addConocimiento(String conoc){
        if (!conocimientos.contains(conoc.toLowerCase())) {
            conocimientos.add(conoc.toLowerCase());
        }
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public ArrayList<String> getConocimientos() {
        return conocimientos;
    }
    public ArrayList<String> getTpAsignados() {
        return tpAsignados;
    }
}
