package Tp9.Aseguradora;
import java.util.ArrayList;

import Tp9.Aseguradora.Condiciones.Condicion;

public abstract class ElementoSer {
    private int dni;

    public ElementoSer(int dni) {
        this.dni = dni;
    }
    public ElementoSer() {
        this.dni = 0;
    }
    public abstract int getNumPoliza();
    public abstract double getMonto();
    public abstract ArrayList<Ssimple> buscar(Condicion cond);

    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    
}
