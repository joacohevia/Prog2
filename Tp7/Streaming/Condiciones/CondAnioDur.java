package Streaming.Condiciones;

import Streaming.Pelicula;

public class CondAnioDur extends Condicion{
    private int anio;
    private int duracion;

    public CondAnioDur(){
        this.anio = 2015;
        this.duracion = 95;
    }
    @Override
    public boolean cumple(Pelicula pel) {
        return pel.getAnio() < anio && pel.getDuracionMin() < duracion;
    }
    
}
