package Vivero.Condiciones;
import Vivero.Planta;

public class CondNombre extends Condicion{
private String nomBuscar;
    public CondNombre(){
        this.nomBuscar = "auereum";
    }
    @Override
    public boolean cumple(Planta planta) {
        return planta.getNombre().equalsIgnoreCase(nomBuscar);
    }
    
}
