package Streaming.Condiciones;

import Streaming.Pelicula;

public class CondNodirec extends Condicion{
    private String director = "Martin";
    public CondNodirec(){
        this.director = "Martin";
    }
    public CondNodirec(String direc){
        this.director = direc;
    }

    @Override
    public boolean cumple(Pelicula pel) {
        return !pel.getDirector().equalsIgnoreCase(director);
    }
    
}
