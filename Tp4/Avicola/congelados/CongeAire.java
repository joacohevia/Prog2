package Tp4.Avicola.congelados;

import java.time.LocalDate;

import Tp4.Avicola.ProducConge;

public class CongeAire extends ProducConge{
    private int nitrogeno;
    private int oxigeno;
    private int dCarbono;
    private int vapor;

    
    public CongeAire(LocalDate fechaVenc, int numLote, int idOrganism, LocalDate fechaEnva, String tempRecomendad,
            String granj, int nitrogeno, int oxigeno, int dCarbono, int vapor) {

        super(fechaVenc, numLote, idOrganism, fechaEnva, tempRecomendad, granj);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.dCarbono = dCarbono;
        this.vapor = vapor;
    }
    @Override
    public String getEtiqueta(){
        return super.getEtiqueta() + (" N%"+nitrogeno+" Oxi%"+oxigeno+
        " dioxidoC%"+dCarbono+" Vapor%"+vapor);
    }
    public int getNitrogeno() {
        return nitrogeno;
    }
    public void setNitrogeno(int nitrogeno) {
        this.nitrogeno = nitrogeno;
    }
    public int getOxigeno() {
        return oxigeno;
    }
    public void setOxigeno(int oxigeno) {
        this.oxigeno = oxigeno;
    }
    public int getdCarbono() {
        return dCarbono;
    }
    public void setdCarbono(int dCarbono) {
        this.dCarbono = dCarbono;
    }
    public int getVapor() {
        return vapor;
    }
    public void setVapor(int vapor) {
        this.vapor = vapor;
    }

    
}
