package PapaNoel;
import java.util.ArrayList;

public class Carta {
    public static final String CAMBIO = "Trozo de carbon";
    private ArrayList <String> regalos;
    private Ninio n1;
    
    public Carta(Ninio n1) {
        this.n1 = n1;
        this.regalos = new ArrayList<>();
    }
    public void remplazarCarbon(){
        this.regalos.clear();
        this.regalos.add(CAMBIO);
    }
    public boolean tieneRegalo(String rr){
        return regalos.contains(rr.toLowerCase());
    }
    public void addRegalos(String rr){
        if (!regalos.contains(rr.toLowerCase())) {
            regalos.add(rr);
        }
    }
    public Ninio getRemitente() {
        return n1;
    }
    public void setN1(Ninio n1) {
        this.n1 = n1;
    }
    public ArrayList<String> getRegalos() {
        return regalos;
    }
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null){
            return false;
        } 
        Carta carta = (Carta) o;
        return n1.getDni().equals(carta.n1.getDni());  // Comparando por DNI
    }
}
