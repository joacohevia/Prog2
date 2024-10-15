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
    capelucita.addAutores("sant");
    capelucita.addPalabras("cap");

    raul.addDocumentos(biblia);
    raul.addDocumentos(capelucita);
    raul.addDocumentos(selva);


    CondNombre cond1 = new CondNombre("capelucITA");
    CondPalFrase condFrase = new CondPalFrase("cape");
    CondPalClave palabraClave = new CondPalClave("dios");
    CondNoClave noTieneClave = new CondNoClave();
    CondAutor nombreAutor = new CondAutor("sant");
    CondNot condnot = new CondNot(cond1);
    CondContenido contenidoMayor = new CondContenido(5);
    CondAnd cAnd = new CondAnd(condnot,nombreAutor);

    
    ArrayList <Documento> resultados = raul.buscar(cAnd);
    /*tengo que implementar metodo buscar como en la farmacia... */
	System.out.println(resultados);
    }
}
