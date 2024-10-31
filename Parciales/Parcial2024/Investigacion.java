package Parcial2024;

import java.time.LocalDate;

public class Investigacion{
    private LocalDate fecha;
    private String titulo;
    private String doi;
    private int impacto;
    private int citas;
    
    public Investigacion(LocalDate fecha, String titulo, String doi, int impacto, int citas) {
        this.fecha = fecha;
        this.titulo = titulo;
        this.doi = doi;
        this.impacto = impacto;
        this.citas = citas;
    }
    public int getRelevancia(){
        return getImpacto()*getCitas();
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDoi() {
        return doi;
    }
    public void setDoi(String doi) {
        this.doi = doi;
    }
    public int getImpacto() {
        return impacto;
    }
    public void setImpacto(int impacto) {
        this.impacto = impacto;
    }
    public int getCitas() {
        return citas;
    }
    public void setCitas(int citas) {
        this.citas = citas;
    }

    
}
