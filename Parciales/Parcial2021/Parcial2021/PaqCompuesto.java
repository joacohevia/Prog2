package Parcial2021;

import java.time.LocalDate;
import java.util.ArrayList;

import cond.condicion;

public class PaqCompuesto extends PaqViaje{
    private ArrayList <PaqViaje> paquetes;

    public PaqCompuesto(int id,int cant){
        super(id,cant);
        paquetes = new ArrayList<>();
    }
    public void addPaquete(PaqViaje pp){
        if (pp.getCantidad() == this.getCantidad()) {
            if (paquetes.isEmpty()) {
                paquetes.add(pp);
            }else{
                if (this.getDestino().equals(pp.getOrigen())) {
                    paquetes.add(pp);
                }
            }
        }
    }
    @Override
    public String toString() {
        return "PaqCompuesto [paquetes=" + paquetes + "]";
    }
    @Override
    public String getOrigen() {
       if (!paquetes.isEmpty()) {
            return paquetes.get(0).getOrigen();
       }
       return null;
    }

    @Override
    public String getDestino() {
       int size = paquetes.size();
       if (size>0) {
            return paquetes.get(size-1).getDestino();
       }
       return null;
    }

    @Override
    public LocalDate getFecha() {
        LocalDate mayor = LocalDate.of(1,1,1);
        for (PaqViaje pq : paquetes) {
            if (pq.getFecha() == null) {
                return null;
            }
            else {
                if (pq.getFecha().isAfter(mayor)) {
                    mayor = getFecha();
                }
            }
        }
        return mayor;
    }

    @Override
    public double getCosto() {
        double result = 0;
        for (PaqViaje paqViaje : paquetes) {
            result += paqViaje.getCosto();
        }
        return result;
    }
    public int tieneEle(){
        return paquetes.size();
    }
    @Override
    public ArrayList<PaqViaje> buscar(condicion cc) {
        ArrayList <PaqViaje> result = new ArrayList<>();
        if (cc.cumple(this)) {
            result.add(this);//si yo cumplo me agrego
        }else{//sino recorro mis hijos y los agrego
            for (PaqViaje paq : paquetes) {
                result.addAll(paq.buscar(cc));
            }
            /* esto es lo mismo 
            for (int i = 0; i < paquetes.size(); i++) {
                result.addAll(paquetes.get(i).buscar(cc));
            }*/
        }
        return result;
    }
    
}
