package BusqDoc;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Historiador raul = new Historiador("raul");
    
    Documento biblia = new Documento("biblia", "la ultima cena");
    biblia.addAutores("diego");
    biblia.addPalabras("dios");
    
    Documento selva = new Documento("selvaa", "el libro de la selva");
    selva.addAutores("sant");


    Documento capelucita = new Documento("capelucita", "el ultimo almuerzo");
    capelucita.addAutores("joaquin");
    capelucita.addPalabras("cap");

    raul.addDocumentos(biblia);
    raul.addDocumentos(capelucita);
    raul.addDocumentos(selva);


    CondNombre cond1 = new CondNombre("capelucITA");
    CondPalClave palabraClave = new CondPalClave("dios");
    CondNoClave noTieneClave = new CondNoClave();
    CondAutor nombreAutor = new CondAutor("sant");
    CondContenido contenidoMayor = new CondContenido(5);

    
    ArrayList <Documento> resultados = raul.buscar(contenidoMayor);
    /*tengo que implementar metodo buscar como en la farmacia... */
	System.out.println(resultados);
    }
}
