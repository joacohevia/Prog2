package Tp4.Avicola;

import java.time.LocalDate;

public class ProducRefri extends Producto{
    protected int idOrganismo;
    protected LocalDate fechaEnvac;
    protected String tempRecomendada;
    protected String granja;

    public ProducRefri(LocalDate fechaVenc, int numLote,int idOrganism,LocalDate fechaEnva,
    String tempRecomendad,String granj){
        super(fechaVenc, numLote);
        this.idOrganismo = idOrganism;
        this.fechaEnvac = fechaEnva;
        this.tempRecomendada = tempRecomendad;
        this.granja = granj;

    }
    public String getEtiqueta(){
        return super.getEtiqueta() + (" Cod org: "+idOrganismo+" Fecha envace: "+fechaEnvac+
        " Temperatura recon: "+tempRecomendada+" Granja "+granja);
    }
    public int getIdOrganismo() {
        return idOrganismo;
    }

    public void setIdOrganismo(int idOrganismo) {
        this.idOrganismo = idOrganismo;
    }

    public LocalDate getFechaEnvac() {
        return fechaEnvac;
    }

    public void setFechaEnvac(LocalDate fechaEnvac) {
        this.fechaEnvac = fechaEnvac;
    }

    public String getTempRecomendada() {
        return tempRecomendada;
    }

    public void setTempRecomendada(String tempRecomendada) {
        this.tempRecomendada = tempRecomendada;
    }

    public String getGranja() {
        return granja;
    }

    public void setGranja(String granja) {
        this.granja = granja;
    }
    


}
