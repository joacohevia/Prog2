package Tp4.Avicola;

import java.time.LocalDate;

public class ProducFreco extends Producto{
    private LocalDate fechaEnvace;
    private String granjaOrigen;

    public ProducFreco(LocalDate fechaVenc, int numLote, LocalDate fechaEnvace, String granjaOrigen) {
        super(fechaVenc, numLote);
        this.fechaEnvace = fechaEnvace;
        this.granjaOrigen = granjaOrigen;
    }

    public String getEtiqueta(){
        return super.getEtiqueta() + (" Fecha de envace: "+fechaEnvace+" Granja: "+granjaOrigen);
    }
    
    public LocalDate getFechaEnvace() {
        return fechaEnvace;
    }

    public void setFechaEnvace(LocalDate fechaEnvace) {
        this.fechaEnvace = fechaEnvace;
    }

    public String getGranjaOrigen() {
        return granjaOrigen;
    }

    public void setGranjaOrigen(String granjaOrigen) {
        this.granjaOrigen = granjaOrigen;
    }

    
}
