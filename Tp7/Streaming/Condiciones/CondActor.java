package Streaming.Condiciones;

import Streaming.Pelicula;

public class CondActor extends Condicion{
    private String actor;

    public CondActor(String acto){
        this.actor = acto;
    }
    @Override
    public boolean cumple(Pelicula pel) {
       return pel.getActores().contains(actor);
    }
    
}
