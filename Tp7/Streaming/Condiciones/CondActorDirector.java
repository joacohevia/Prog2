package Streaming.Condiciones;

import Streaming.Pelicula;

public class CondActorDirector extends Condicion{
    private String actor;
    private String director;

    public CondActorDirector(String acto,String direc){
        this.actor = acto;
        this.director = direc;
    }
    public CondActorDirector() {
        this.actor = "Will";
        this.director = "Martin";
    }
    
    @Override
    public boolean cumple(Pelicula pel) {
       return pel.buscarActor(actor) && !pel.getDirector().equals(director);
    }
    
}
