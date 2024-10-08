package Vivero;

import java.util.ArrayList;

public class Planta {
    private String nombre;
    private ArrayList <String> nombresVulgares;
    private String clasificacion;
    private String familia;
    private String clase;
    private boolean interior;
    private int requerimientoSol;
    private int requerimientoAgua;

    
    public Planta(String nombre, String clasificacion, String familia, String clase, boolean interior,
            int requerimientoSol, int requerimientoAgua) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.familia = familia;
        this.clase = clase;
        this.interior = interior;
        this.setRequerimientoAgua(requerimientoAgua);
        this.setRequerimientoSol(requerimientoSol);
        this.nombresVulgares = new ArrayList<>();
    }
    public void addNombres(String nom){
        if (!nombresVulgares.contains(nom)) {
            nombresVulgares.add(nom.toLowerCase());
        }
    }
    public boolean tieneNomVulgar (String nombre){
        return this.nombresVulgares.contains(nombre.toLowerCase());
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getClasificacion() {
        return clasificacion;
    }
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    public String getFamilia() {
        return familia;
    }
    public void setFamilia(String familia) {
        this.familia = familia;
    }
    public String getClase() {
        return clase;
    }
    public void setClase(String clase) {
        this.clase = clase;
    }
    public boolean isInterior() {
        return interior;
    }
    public void setInterior(boolean interior) {
        this.interior = interior;
    }
    public int getRequerimientoSol() {
        return requerimientoSol;
    }
    public void setRequerimientoSol(int requerimientoSol) {
        if (requerimientoSol<=10 && requerimientoSol>0) {
            this.requerimientoSol = requerimientoSol;
        }else{
            System.out.println("no se puede agregar");
        }
    }
    public int getRequerimientoAgua() {
        return requerimientoAgua;
    }
    public void setRequerimientoAgua(int requerimientoAgua) {
        if (requerimientoAgua<10 && requerimientoAgua>0) {
            this.requerimientoAgua = requerimientoAgua;            
        }
    }
    @Override
    public String toString() {
        return "Planta [nombre=" + nombre + ", nombresVulgares=" + nombresVulgares + ", clasificacion=" + clasificacion
                + ", familia=" + familia + ", clase=" + clase + ", interior=" + interior + ", requerimientoSol="
                + requerimientoSol + ", requerimientoAgua=" + requerimientoAgua + "]";
    }

    
}
