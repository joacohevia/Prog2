package Parcial2021;
import java.time.LocalDate;
import java.util.ArrayList;

import cond.condicion;

public abstract class PaqViaje {
    private int id;
    private int cantidad;

    public abstract String getOrigen();
    public abstract String getDestino();
    public abstract LocalDate getFecha();
    public abstract double getCosto();
    public abstract ArrayList <PaqViaje> buscar(condicion cc);
    @Override
    public String toString() {
        return "PaqViaje [id=" + id + ", cantidad=" + cantidad + "]";
    }
    public PaqViaje(int id, int cantidad) {
        this.id = id;
        this.cantidad = cantidad;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}