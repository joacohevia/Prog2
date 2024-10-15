package Parcialito4;

import java.util.ArrayList;

public class Producto {
    private String nombre;
    private ArrayList<Material> materiales;
    private String fabricante;
    private int anioFabricacion;
    private double peso;

    public Producto(String nom,String fabricante, int anioFabricacion, double peso) {
        nombre = nom;
        this.fabricante = fabricante;
        this.anioFabricacion = anioFabricacion;
        this.peso = peso;
        this.materiales= new ArrayList<Material>();
    }

    public void addMaterial(Material nuevo){
        if(!materiales.contains(nuevo)){
            materiales.add(nuevo);
        }
    }

    public boolean tieneMaterial(Material material){
        return this.materiales.contains(material);
    }
    public String getNombre() {
        return nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public boolean equals(Object obj) {
        return this.getNombre().equals(((Producto)obj).getNombre());
    }

    @Override
    public String toString() {
        return "Producto{" +
                ", nombre='" + nombre + '\'' +
                "materiales=" + materiales +
                ", peso=" + peso +
                ", anioFabricacion=" + anioFabricacion +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }
}
