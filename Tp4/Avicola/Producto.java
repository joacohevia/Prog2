package Tp4.Avicola;

import java.time.LocalDate;

public class Producto {
    private LocalDate fechaVenc;
    private int numLote;

    public Producto(LocalDate fechaVenc, int numLote) {
        this.fechaVenc = fechaVenc;
        this.numLote = numLote;
    }
    public String getEtiqueta(){
        return ("Fecha de vencimiento: "+fechaVenc+" Num de lote: "+numLote);
    }
    

    public LocalDate getFechaVenc() {
        return fechaVenc;
    }
    public void setFechaVenc(LocalDate fechaVenc) {
        this.fechaVenc = fechaVenc;
    }
    public int getNumLote() {
        return numLote;
    }
    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    
}
