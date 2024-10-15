
import java.util.ArrayList;

public class Cultivo{
    private String nombre;
    private ArrayList <Enfermedad> enfermedad;

    public Cultivo(String nombre){
        this.nombre = nombre;
        this.enfermedad = new ArrayList<>();
    }
    @Override
    public String toString() {
        return "Cultivo [nombre=" + nombre + ", enfermedad=" + enfermedad + "]";
    }
    public void addEnfermedad(Enfermedad enfer){
        if (!enfermedad.contains(enfer)) {
            enfermedad.add(enfer);
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public ArrayList<Enfermedad> getEnfermedad() {
        return enfermedad;
    }
}
