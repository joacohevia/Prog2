package Computos2;

import java.time.LocalDate;

public class CCamion extends Elementos{
    private LocalDate fecha;

    public CCamion(LocalDate fecha){
        this.fecha = fecha;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
