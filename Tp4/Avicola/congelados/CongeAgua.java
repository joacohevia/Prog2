package Tp4.Avicola.congelados;

import java.time.LocalDate;

import Tp4.Avicola.ProducConge;

public class CongeAgua extends ProducConge{
    private double salidad;

    public CongeAgua(LocalDate fechaVenc, int numLote, int idOrganism, LocalDate fechaEnva, String tempRecomendad,
            String granj, double salidad) {

        super(fechaVenc, numLote, idOrganism, fechaEnva, tempRecomendad, granj);
        this.salidad = salidad;
    }
    public String getEtiqueta(){
        return super.getEtiqueta() + (" Salidad del agua: "+salidad);
    }

    public double getSalidad() {
        return salidad;
    }

    public void setSalidad(double salidad) {
        this.salidad = salidad;
    }

    

}
