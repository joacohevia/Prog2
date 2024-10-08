package sistemaArchivos;

import java.util.ArrayList;

import sistemaArchivos.condiciones.CondNot;
import sistemaArchivos.condiciones.CondTamanioMayor;
import sistemaArchivos.condiciones.Condicion;

public class Main {
    public static void main(String[] args) {
        Directorio raiz =  new Directorio("raiz");
        Directorio d2 =  new Directorio("TUDAI");
        Directorio d3 =  new Directorio("Prog2");

        Archivo parcial = new Archivo("parcial", 20.0, "txt");
        Archivo recu = new Archivo("recu", 420.5, "pdf");
        Archivo prefi = new Archivo("prefi", 5420.5, "pdf");

        raiz.addElemento(d2);//3
        raiz.addElemento(parcial);//2 es un archivo con su carpeta
        raiz.addElemento(d3);//1 no tiene arch cuenta solo la carpeta
        
        d2.addElemento(recu);
        d2.addElemento(prefi);

        System.out.println(raiz.getTamanio()+" --- cant elementos "+raiz.cantElementos());
        System.out.println(d2.getTamanio()+" --- cant elementos "+d2.cantElementos());
        System.out.println(d3.getTamanio()+" --- cant elementos "+d3.cantElementos());

        AccesoDirecto acceso = new AccesoDirecto(prefi);
        System.out.println(acceso);

        Condicion cond =  new CondTamanioMayor(100.0);
        Condicion menores = new CondNot(cond);
        ArrayList<Archivo> resultado = raiz.buscar(menores);
        System.out.println(resultado);
    }
}
