package Streaming;
import java.util.ArrayList;

import Streaming.Condiciones.Condicion;

public class Streaming {
    private ArrayList <Pelicula> peliculas;

    public Streaming(){
        this.peliculas = new ArrayList<>();
    }
    public void addPelicula(Pelicula pel,Condicion c1, Condicion c2){
        if (!peliculas.contains(pel)) {
            if (c1.cumple(pel)&&c2.cumple(pel)) {
                peliculas.add(pel);
            }
        }   
    }
    public ArrayList<Pelicula> buscar(Condicion con){
        ArrayList<Pelicula> salida = new ArrayList<Pelicula>();
        for (int i = 0; i < peliculas.size(); i++) {
            Pelicula pel = peliculas.get(i);
            if (con.cumple(pel)) {
                salida.add(pel);
            }
        }
        return salida;
    }
    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }
}
