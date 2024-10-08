package Streaming.Condiciones;

import Streaming.Pelicula;

public class CondPeliAnioGen extends Condicion{
    private int anioMinimo;
    private String genExcepcion;
    private String genExcepcion1;

    public CondPeliAnioGen(int anio, String gen, String gen1) {
        this.anioMinimo = anio;
        this.genExcepcion = gen;
        this.genExcepcion1 = gen1;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getAnio() > anioMinimo && 
               !(pelicula.getGeneros().equalsIgnoreCase(genExcepcion) || 
                 pelicula.getGeneros().equalsIgnoreCase(genExcepcion1));
    }
}
