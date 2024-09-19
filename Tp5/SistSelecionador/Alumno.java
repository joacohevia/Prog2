package Tp5.SistSelecionador;
import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList <String> habilidades;
    private ArrayList <String> familiares;
    private boolean casaAsig;

    
    public Alumno(String nombre, ArrayList<String> habilidades, ArrayList<String> familiares, boolean casaAsig) {
        this.nombre = nombre;
        this.habilidades = habilidades;
        this.familiares = familiares;
        this.casaAsig = casaAsig;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<String> getHabilidades() {
        return habilidades;
    }
    public void setHabilidades(ArrayList<String> habilidades) {
        this.habilidades = habilidades;
    }
    public ArrayList<String> getFamiliares() {
        return familiares;
    }
    public void setFamiliares(ArrayList<String> familiares) {
        this.familiares = familiares;
    }
    public boolean isCasaAsig() {
        return casaAsig;
    }
    public void setCasaAsig(boolean casaAsig) {
        this.casaAsig = casaAsig;
    }

    
}
