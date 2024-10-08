package Tareas;

import java.util.ArrayList;

public class TareaCompuesta extends Tarea{
    private String especialidad;
    private ArrayList <Tarea> tareasComp;

    
    public TareaCompuesta(String especialidad) {
        this.especialidad = especialidad;
        this.tareasComp = new ArrayList<>();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public void addTareaComp(Tarea tt){
        tareasComp.add(tt);
    }

    @Override
    public int costo() {
        int costo = 0;
        for (Tarea tt : tareasComp) {
            costo += tt.costo();
        }
        return costo;
    }
    @Override
    public boolean esSimple() {
        return false;
    }

    @Override
    public int tiempo() {
        int tiempo = 0;
        for (Tarea tt : tareasComp) {
            tiempo += tt.tiempo();
            if (tt.esSimple()) {
                tiempo += 10; // Sumar 10 minutos si la tarea es simple
            }
        }
        return tiempo;
    }
    
    public int contarTareasSimples() {
        int contador = 0;
        for (Tarea tt : tareasComp) {
            if (tt.esSimple()) {
                contador++; 
            } else {
                // tt es de tipo compuesta y llamo al mismo metodo pero esta vez
                // entra al es simple si tiene tareas simples
                contador += ((TareaCompuesta) tt).contarTareasSimples();
            }
        }
        return contador; 
    }


    @Override
    public String toString() {
        return "TareaCompuesta, especialidad=" + especialidad + ", tareas: " + tareasComp + "]";
    }
    
}
