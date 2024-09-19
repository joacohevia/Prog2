package Tp4.Avicola.congelados;

import java.time.LocalDate;
import java.time.LocalTime;

import Tp4.Avicola.ProducConge;

public class CongeNitro extends ProducConge{
    private String metodo;
    private LocalTime tiempo;

    public CongeNitro(LocalDate fechaVenc, int numLote, int idOrganism, LocalDate fechaEnva, String tempRecomendad,
            String granj, String metodo, LocalTime tiempo) {

        super(fechaVenc, numLote, idOrganism, fechaEnva, tempRecomendad, granj);
        this.metodo = metodo;
        this.tiempo = tiempo;
    }

    public String getEtiqueta(){
        return super.getEtiqueta() + (" Tiempo: "+tiempo+" Metodo: "+metodo);
    }
    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public LocalTime getTiempo() {
        return tiempo;
    }

    public void setTiempo(LocalTime tiempo) {
        this.tiempo = tiempo;
    }

    

    
    
}
