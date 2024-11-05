package ParcialSIS;

import java.util.ArrayList;

import ParcialSIS.Condiciones.Condicion;

public class Establecimiento extends Elemento{
    private ArrayList <Elemento> camas;

    public Establecimiento() {
        camas = new ArrayList<>();
    }

    @Override
    public int getCantidadCamas() {
        int suma = 0;
        for (Elemento ele : camas) {
            suma += ele.getCantidadCamas();
        }
        return suma;
    }

    @Override
    public ArrayList<Elemento> getCamDisponibles(Paciente pp) {
        ArrayList <Elemento> disp = new ArrayList<>();
        for (Elemento elem : camas) {
            disp.addAll(elem.getCamDisponibles(pp));
        }
        return disp;
    }
   

    @Override
    public Elemento getCopia(Condicion cc) {
        Establecimiento copia = crearCascaron();
        for (Elemento elem : camas) {//controlar null
            copia.addElemento(elem.getCopia(cc));
        }
        return copia;
    }

    //Factory Method
    protected Establecimiento crearCascaron() {
     return new Establecimiento();
 }
    public void addElemento(Elemento ee){
        camas.add(ee);
    }

    
    
}
