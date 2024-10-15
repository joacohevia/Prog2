package sitioWeb1;

import java.util.ArrayList;

import sitioWeb1.CondicionesWeb.CondAutor;
import sitioWeb1.CondicionesWeb.CondMinimo;
import sitioWeb1.CondicionesWeb.CondPalClave;
import sitioWeb1.CondicionesWeb.CondTitulo;

public class Main {
    public static void main(String[] args) {
        Noticia n1 = new Noticia("Futbol", "aaa", "aaaaaaa", "Juan Perez", "www");
        Noticia n2 = new Noticia("Goleada", "aaa", "aaaaaaaaa", "kiliam", "www");
        n2.addPalabra("partido");
        n2.addPalabra("goleada");
        Noticia n3 = new Noticia("necrologicas", "aaa", "aaa", "kiliam", "www");
        Noticia n4 = new Noticia("ultimo momento", "sds", "sdssd", "sdas", "ds");

        Categoria seccionFutbol = new Categoria("Seccion fut", "seccion");
        Categoria deporte = new Categoria("depor", "png");
        deporte.addElemento(n1);
        deporte.addElemento(n2);
        deporte.addElemento(n4);
        seccionFutbol.addElemento(deporte);

        Categoria necrologica = new Categoria("necrologica", "necro.png");
        necrologica.addElemento(n3);

        System.out.println(seccionFutbol.cantidadNoticias());
        
        CondAutor condAut = new CondAutor();
        CondPalClave condPal = new CondPalClave();
        CondTitulo condTit = new CondTitulo();
        CondMinimo condMin = new CondMinimo();

        ArrayList <Noticia> resultado = seccionFutbol.buscar(condMin);
        System.out.println(resultado);

    }   
}
