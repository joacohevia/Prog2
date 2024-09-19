package Tp5.CooAgricultores;
import java.util.ArrayList;
public class Lote {
    private String ubicacion;
    private double tamanio;
    private ArrayList <String> mineralesLote;
    

    public Lote(String ubicacion, double tamanio) {
        this.ubicacion = ubicacion;
        this.tamanio = tamanio;
        this.mineralesLote = new ArrayList<>();
    }
    public double getTamanio() {
        return tamanio;
    }
    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    public ArrayList<String> getMineralesLote() {
        return mineralesLote;
    }
    public boolean esApto(){
        return this.getTamanio()>= 50;
    }
    public void setMineralesLote(ArrayList<String> mineralesLote) {
        this.mineralesLote = mineralesLote;
    }
    public void addMineral(String mm){
        //String nom = mm.getNombre().toUpperCase();
        //mm.setNombre(nom);
        this.mineralesLote.add(mm.toUpperCase());
    }
    
      
    public boolean contieneMineral(String mineral) {
        return mineralesLote.contains(mineral.toUpperCase());
    }
    
    public boolean esPastura(Cereal cereal) {
        return this.tamanio >= 50;
    }
    
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    @Override
    public String toString() {
        return "Lote [ubicacion=" + ubicacion + ", tamanio=" + tamanio + ", mineralesLote=" + mineralesLote + "]";
    }
    

}
