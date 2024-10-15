package Streaming.Condiciones;

import Streaming.Pelicula;

public class CondAnioDur extends Condicion{
    private int anio;

    public CondAnioDur(int anio){
        this.anio = anio;
        
    }
    @Override
    public boolean cumple(Pelicula pel) {
        return pel.getAnio() > anio;
    }
    
}
