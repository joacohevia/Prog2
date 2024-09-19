package Congreso8;

import java.util.ArrayList;

public class Trabajo {
    private String tipo;
    private ArrayList <String> temasArticulo;
    private ArrayList <String> temasPoster;
    private ArrayList <String> temasResumen;
    

    public Trabajo(String tipo){
        this.tipo = tipo;
        this.temasArticulo = new ArrayList<>();
        this.temasPoster = new ArrayList<>();
        this.temasResumen = new ArrayList<>();

    }
    public void addTemasResuemen(String tem){
        if (!temasResumen.contains(tem.toLowerCase())) {
            this.temasResumen.add(tem.toLowerCase());
        }
    }
    public void addTemasArticulo(String tem){
        if (!temasArticulo.contains(tem.toLowerCase())) {
            this.temasArticulo.add(tem.toLowerCase());
        }
    }
    public void addTemasPoster(String tem){
        if (!temasPoster.contains(tem.toLowerCase())) {
            this.temasPoster.add(tem.toLowerCase());
        }
    }
    public boolean esArticulo(){
        return getTipo().equals("articulo");
    }
    public boolean esPoster(){
        return getTipo().equals("poster");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public ArrayList<String> getTemasResumen() {
        return this.temasResumen;
    }
    public ArrayList<String> getTemasPoster() {
        return this.temasPoster;
    }  
    public ArrayList<String> getTemasArticulo() {
        return this.temasArticulo;
    }  
}
