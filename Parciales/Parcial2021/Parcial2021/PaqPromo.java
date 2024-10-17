package Parcial2021;

import java.time.LocalDate;

public class PaqPromo extends PaqueteSimple{
    private LocalDate finicio;
    private LocalDate ffin;
    private double decuento;

    public PaqPromo(int id, int cantidad, String origen, String destino, double costo, String datosAloj,LocalDate fini,LocalDate ffi,double des) {
        super(id, cantidad, origen, destino, costo, datosAloj);
        this.finicio = fini;
        this.ffin = ffi;
        this.decuento = des;
    }
    public double getCosto(){
        if (this.getFecha()!=null) {
            if (this.getFecha().isAfter(finicio)&&
            this.getFecha().isBefore(ffin)) {
                return super.getCosto()*decuento;
            }
        }
        return super.getCosto();
    }
    
    public LocalDate getFinicio() {
        return finicio;
    }
    public void setFinicio(LocalDate finicio) {
        this.finicio = finicio;
    }
    public LocalDate getFfin() {
        return ffin;
    }
    public void setFfin(LocalDate ffin) {
        this.ffin = ffin;
    }
    public double getDecuento() {
        return decuento;
    }
    public void setDecuento(double decuento) {
        this.decuento = decuento;
    }
    
}
