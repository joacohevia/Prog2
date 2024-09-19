package Tp5.GastoPublico;
import java.util.ArrayList;
public class Ciudad {
    private String nombre;
    private ArrayList <Contribuyente> contribuyentes;

    public Ciudad(String nombre){
        this.nombre = nombre;
        this.contribuyentes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Contribuyente> getContribuyentes() {
        return contribuyentes;
    }


    public void addContribuyentes(Contribuyente cc){
        boolean aux = true;
        for (Contribuyente cons : contribuyentes) {
            if (cons.getCod() == cc.getCod()) {
                aux=false;
            }
        }
        if (aux) {
            this.contribuyentes.add(cc);
        }else{
            System.out.println("Contribuyente ya agregado");
        }
    }

    
}
