package ParSitioweb.CondicionesWeb;

import ParSitioweb.Video;

public class CondAnio extends Condicion{
    private int anio;

    public CondAnio(){
        anio = 2020;
    }
    @Override
    public boolean cumple(Video vv) {
        return vv.getAnio() == anio;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    
}
