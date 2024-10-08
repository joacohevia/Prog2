package Academia;

import java.util.ArrayList;

public class Pregunta extends Evaluacion{
    private String enunciado;
    private int puntaje;
    private int tiempo;
    private ArrayList <String> conceptos;
    
    @Override
    public String toString() {
        return "Pregunta puntaje=" + puntaje + ", tiempo=" + tiempo + ", conceptos="
                + conceptos + "]";
    }
    public Pregunta(String enunciado, int puntaje, int tiempo) {
        this.enunciado = enunciado;
        this.puntaje = puntaje;
        this.tiempo = tiempo;
        this.conceptos = new ArrayList<>();
    }
    public void addConceptos(String pp){
        if (!conceptos.contains(pp.toLowerCase())) {
            conceptos.add(pp.toLowerCase());
        }
    }
    public String getEnunciado() {
        return enunciado;
    }
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
   
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
   
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    @Override
    public int puntaje() {
            return puntaje;
        
    }
    @Override
    public int tiempo() {
        return tiempo;

    }
    @Override
    public ArrayList<String> getConceptos() {
       return null;
    }

    
}
