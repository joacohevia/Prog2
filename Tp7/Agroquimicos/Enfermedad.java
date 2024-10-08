import java.util.ArrayList;

public class Enfermedad{
    private String nombre;
    private ArrayList <String> sintomas;
    
    public Enfermedad(String nombre) {
        this.nombre = nombre;
        this.sintomas = new ArrayList<>();
    }
    public void addSintomas(String sin){
        if (!sintomas.contains(sin.toLowerCase())) {
            sintomas.add(sin);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<String> getSintomas() {
        return sintomas;
    }
    
}
