package Parcial2021;


import java.time.LocalDate;
import java.util.ArrayList;

import cond.condicion;


public class PaqueteSimple extends PaqViaje{
    private String origen;
    private String destino;
    private double costo;
    private String datosAloj;
    private LocalDate fecha;
    
    public PaqueteSimple(int id, int cantidad, String origen, String destino, double costo, String datosAloj) {
        super(id, cantidad);
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.datosAloj = datosAloj;
        this.fecha = null;
    }
    @Override
public String toString() {
    return "PaqueteSimple" + ", Origen=" + origen + ", Destino=" + destino + ", Costo=" + costo + "]";
}

    @Override
    public String getOrigen() {
        return this.origen;
    }
    @Override
    public String getDestino() {
       return destino;
    }
    @Override
    public LocalDate getFecha() {
        return fecha;
    }
    @Override
    public double getCosto() {
        return costo;
    }
    public String getDatosAloj() {
        return datosAloj;
    }
    public void setDatosAloj(String datosAloj) {
        this.datosAloj = datosAloj;
    }
    @Override
    public ArrayList<PaqViaje> buscar(condicion cc) {
        ArrayList <PaqViaje> result = new ArrayList<>();
        if (cc.cumple(this)) {
            result.add(this);
        }
        return result;
    }


}
