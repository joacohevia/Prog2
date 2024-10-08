
import java.util.ArrayList;

public class ProducQuimico {
    private String nombre;
    private ArrayList <String> cultivosNoaptos;
    private ArrayList <String> sintomasAtratar;
    
    public ProducQuimico(String nombre) {
        this.nombre = nombre;
        this.cultivosNoaptos = new ArrayList<>();
        this.sintomasAtratar = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addSintomasAtratar(String sin){
        if (!sintomasAtratar.contains(sin.toLowerCase())) {
            sintomasAtratar.add(sin);
        }
    }
    public void addCultivosNoaptos(String cul){
        if (!cultivosNoaptos.contains(cul.toLowerCase())) {
            cultivosNoaptos.add(cul);
        }
    }
    public boolean esApto(Cultivo cult,Enfermedad enfer){
        if (!cultivosNoaptos.contains(cult.getNombre().toLowerCase()) && 
        cumpleSintomas(enfer)) {
            return true;
        }
        return false;
    }
    private boolean cumpleSintomas(Enfermedad enfer) {
        for (String sintomas : enfer.getSintomas()) {
            if (!sintomasAtratar.contains(sintomas.toLowerCase())) {
                return false; 
            }
        }
        return true; 
    }
    
}
