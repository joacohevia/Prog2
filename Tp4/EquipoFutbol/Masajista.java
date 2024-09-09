package Tp4.EquipoFutbol;

import java.time.LocalDate;

public class Masajista extends CuerpoTec {
    private String titulo;
    private int cantAnios;
    
    public Masajista(String nombre, String apellido, String numPasa, LocalDate fechaNac, String titulo, int cantAnios) {
        super(nombre, apellido, numPasa, fechaNac);
        this.titulo = titulo;
        this.cantAnios = cantAnios;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getCantAnios() {
        return cantAnios;
    }
    public void setCantAnios(int cantAnios) {
        this.cantAnios = cantAnios;
    }

    
}
