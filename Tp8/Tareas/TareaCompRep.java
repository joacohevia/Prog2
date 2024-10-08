package Tareas;

import java.util.ArrayList;

public class TareaCompRep extends TareaCompuesta{
    private int repeticion;
    private ArrayList <Tarea> tareasRep;

    
    public TareaCompRep(String especialidad,int repeticion) {
        super(especialidad);
        this.repeticion = repeticion;
        this.tareasRep = new ArrayList<>();
    }
    public void addTareaRep(Tarea tt){    
       tareasRep.add(tt);
     
    }
    public int getRepeticion() {
        return repeticion;
    }

    public void setRepeticion(int repeticion) {
        this.repeticion = repeticion;
    }

    @Override
    public int costo() {
        int costo = 0;
        for (Tarea tt : tareasRep) {
            costo += tt.costo();
        }
        return costo * getRepeticion();
    }

    @Override
    public int tiempo() {
        int tiempo = 0;
        for (Tarea tt : tareasRep) {
            tiempo += tt.tiempo();
        }
        return tiempo * getRepeticion();
    }
    @Override
    public String toString() {
        return "repeticion=" + repeticion + ", tareasRep=" + tareasRep + "]";
    }
    @Override
    public boolean esSimple() {
        return false;
    }

     public ArrayList<Tarea>ListaAcciones() {
        ArrayList<Tarea> listaAcciones = new ArrayList<>();
            for (Tarea tarea : tareasRep) {
                int i=0;
                while (i<repeticion) {
                listaAcciones.add(tarea);
                i++;
                }
            }
        return listaAcciones;
    }
    
}
