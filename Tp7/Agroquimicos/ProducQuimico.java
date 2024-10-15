
import java.util.ArrayList;

public class ProducQuimico {
    private String nombre;
    private ArrayList <Cultivo> cultivosNoaptos;
    private ArrayList <String> sintomasAtratar;
    
    public ProducQuimico(String nombre) {
        this.nombre = nombre;
        this.cultivosNoaptos = new ArrayList<>();
        this.sintomasAtratar = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "ProducQuimico [nombre=" + nombre + "]";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addSintomasAtratar(String sin){
        if (!sintomasAtratar.contains(sin.toLowerCase())) {
            sintomasAtratar.add(sin);
        }
    }
    public void addCultivosNoaptos(Cultivo cul){
        if (!cultivosNoaptos.contains(cul)) {
            cultivosNoaptos.add(cul);
        }
    }
    public boolean trataEnfermedad(Enfermedad e){
        for(String estadoPatologico: sintomasAtratar){
            if(e.contieneEstado(estadoPatologico))
                return true;
        }
        return false;
    }
    public boolean contieneCultivo(Cultivo cultivo){
        return this.cultivosNoaptos.contains(cultivo);
    }
}
