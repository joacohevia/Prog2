package Streaming.Condiciones;

import Streaming.Pelicula;

public class CondGen extends Condicion{
    private String genExcepcion;
    private String genExcepcion1;

    public CondGen(String gen, String gen1) {
        
        this.genExcepcion = gen;
        this.genExcepcion1 = gen1;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return (pelicula.getGeneros().equalsIgnoreCase(genExcepcion) || 
                 pelicula.getGeneros().equalsIgnoreCase(genExcepcion1));
    }
}
