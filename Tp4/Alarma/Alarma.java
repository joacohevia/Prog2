package Tp4.Alarma;

import java.util.ArrayList;

public class Alarma {
    /*private boolean vidrios;
    private boolean puertas;
    private boolean movimiento;*/
    private Timbre timbre;
    private ArrayList <Sensor> sensores;
   

    public Alarma(){
        this.sensores = new ArrayList<>();
        timbre = new Timbre();
    }
    //agregar de a muchos y modificar el comprobar
    public void agregarSensor(Sensor... sensor){
        for (Sensor s : sensor) {
            sensores.add(s);
        }
    }
    public boolean comprobar(){
        for(int i=0; i<sensores.size();i++){
            if (sensores.get(i).getSies()) {
                String nombre = sensores.get(i).getZona();
                timbre.hacerSonar(nombre);
                if (i == sensores.size()-1) {
                    return true;
                }
            }
        }
        System.out.println("TODO EN ORDEN");
        return false;
    }
    /*public Alarma(boolean vidrios, boolean puertas, boolean movimiento) {
        this.vidrios = vidrios;
        this.puertas = puertas;
        this.movimiento = movimiento;
        timbre = new Timbre();
    }*/
    
    /*public boolean comprobar(){
        if (vidrios||puertas||movimiento) {
            timbre.hacerSonar();
            return true;
        }else{
            System.out.println("todo en orden");
            return false;
        }
    }*/


    /*public boolean isVidrios() {
        return vidrios;
    }
    public void setVidrios(boolean vidrios) {
        this.vidrios = vidrios;
    }
    public boolean isPuertas() {
        return puertas;
    }
    public void setPuertas(boolean puertas) {
        this.puertas = puertas;
    }
    public boolean isMovimiento() {
        return movimiento;
    }
    public void setMovimiento(boolean movimiento) {
        this.movimiento = movimiento;
    }*/

    public Timbre getTimbre() {
        return timbre;
    }

    public void setTimbre(Timbre timbre) {
        this.timbre = timbre;
    }

    public ArrayList<Sensor> getSensores() {
        return sensores;
    }

    public void setSensores(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
    }
}
