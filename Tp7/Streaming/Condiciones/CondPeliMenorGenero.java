package Streaming.Condiciones;

import Streaming.Pelicula;

public class CondPeliMenorGenero extends Condicion{
    private int minutos;
    private String genero;

    public CondPeliMenorGenero(int min, String gen){
        this.minutos = min;
        this.genero = gen;
    }
    @Override
    public boolean cumple(Pelicula pel) {
        return pel.getDuracionMin() < minutos && !pel.getGeneros().equalsIgnoreCase(genero);
    }
    
}
