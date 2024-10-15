package Streaming;

import java.util.ArrayList;

import Streaming.Condiciones.CondActor;
import Streaming.Condiciones.CondAnioDur;
import Streaming.Condiciones.CondGen;
import Streaming.Condiciones.CondNodirec;
import Streaming.Condiciones.CondNot;
import Streaming.Condiciones.CondPeliMenorGenero;
import Streaming.Condiciones.CondicionAnd;

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
        cazador2.addActores("negro");
        cazador3.addActores("fran");

        CondAnioDur condAgregar = new CondAnioDur(2017);
        CondGen condAgregarGen = new CondGen("infantil", "documental");
        CondNot condNegar = new CondNot(condAgregarGen);//que no sean ni infantil ni documental
        CondicionAnd condFinal = new CondicionAnd(condAgregar, condNegar);
        
        CondPeliMenorGenero condP1 = new CondPeliMenorGenero(120, "comedia");
        //ESTAS CONDICIONES SON PARA AGREGAR PELICULAS PERO PUEDO USAR CUALQUIER OTRA CONDICION
        s1.addPelicula(cazador,condP1,condFinal);
        s1.addPelicula(cazador2,condP1,condFinal);
        s1.addPelicula(cazador3,condP1,condFinal);
        s1.addPelicula(rapidos,condP1,condFinal);
        s1.addPelicula(rapidos1,condP1,condFinal);

        ArrayList <Pelicula> result = s1.getPeliculas();
        System.out.println(result);


        CondActor cond1 = new CondActor("negro");
        CondNodirec nodirec = new CondNodirec("Martin");
        CondicionAnd and = new CondicionAnd(cond1,nodirec);
        
        ArrayList <Pelicula> resultadosBusqueda = s1.buscar(and);
        System.out.println("BUSQUEDA: "+resultadosBusqueda);
    }
}
