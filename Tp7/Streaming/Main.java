package Streaming;

import java.util.ArrayList;

import Streaming.Condiciones.CondActorDirector;
import Streaming.Condiciones.CondAnioDur;
import Streaming.Condiciones.CondPeliAnioGen;
import Streaming.Condiciones.CondPeliMenorGenero;

public class Main {
    public static void main(String[] args) {
        Streaming s1 = new Streaming();

        Pelicula cazador = new Pelicula("cazador", "guampa", "comedia", "Martin", 2014, 120,18);
        Pelicula cazador2 = new Pelicula("cazador2", "guampa remast", "drama", "bill sucio", 2019, 94,17);
        Pelicula cazador3 = new Pelicula("cazador3", "guampa remastX2", "comedia", "bill sucio poter", 2011, 92,17);

        Pelicula rapidos = new Pelicula("rapidos", "carrera autos", "documental", "bill rapido", 2019, 100,17);
        Pelicula rapidos1 = new Pelicula("rapidos11", "carrera autos1", "accion", "bill rapido11", 2019, 100,17);

 
        cazador.addActores("will");
        cazador2.addActores("will");
        cazador3.addActores("fran");

        CondPeliMenorGenero condP1 = new CondPeliMenorGenero(120, "comedia");
        CondPeliAnioGen condP2 = new CondPeliAnioGen(2017, "infantil", "documental");
        //ESTAS CONDICIONES SON PARA AGREGAR PELICULAS PERO PUEDO USAR CUALQUIER OTRA CONDICION
        s1.addPelicula(cazador,condP1,condP2);
        s1.addPelicula(cazador2,condP1,condP2);
        s1.addPelicula(cazador3,condP1,condP2);
        s1.addPelicula(rapidos,condP1,condP2);
        s1.addPelicula(rapidos1,condP1,condP2);

        ArrayList <Pelicula> result = s1.getPeliculas();
        System.out.println(result);


        CondActorDirector cond1 = new CondActorDirector();
        CondAnioDur cond2 = new CondAnioDur();
        ArrayList <Pelicula> resultadosBusqueda = s1.buscar(cond1);
        System.out.println(resultadosBusqueda);
    }
}
