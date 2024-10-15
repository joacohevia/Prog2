package Tp9.Aseguradora;
import java.util.ArrayList;

import Tp9.Aseguradora.Condiciones.Condicion;

public class Ssimple extends ElementoSer{
    private int numPoliza;
    private double monto;
    private String descripcion;
    private double montoFijo;
    private double porcentaje;
    
   
    @Override
    public ArrayList<Ssimple> buscar(Condicion cond) {
        ArrayList <Ssimple> aux = new ArrayList<>();
        if (cond.cumple(this)) {
            aux.add(this);
        }
        return aux;
    }
    //este constructor es para un seguro comun
    public Ssimple(int numPoliza, int dni, double monto, String descripcion) {
        super(dni);
        this.numPoliza = numPoliza;
        this.monto = monto;
        this.descripcion = descripcion;
    }
    
    public Ssimple(int numPoliza, int dni, double monto, String descripcion, double montoFijo, double porcentaje) {
        this(numPoliza, dni, monto, descripcion);
        this.montoFijo = montoFijo;
        this.porcentaje = porcentaje;
    }
    public double getMontoFijo() {
        return montoFijo;
    }
    @Override
    public double getMonto() {
        return monto;
    }
    @Override
    public String toString() {
        return "Ssimple [numPoliza=" + numPoliza + ", monto=" + monto +" monto aseg "+montoFijo+ ", descripcion=" + descripcion + "]";
    }
    public void setMontoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }
    public double getPorcentaje() {
        return porcentaje;
    }
    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    public int getNumPoliza() {
        return numPoliza;
    }
    public void setNumPoliza(int numPoliza) {
        this.numPoliza = numPoliza;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
