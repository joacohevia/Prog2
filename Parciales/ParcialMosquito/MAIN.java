package ParcialMosquito;

import java.util.ArrayList;

import ParcialMosquito.Condiciones.CondCosto;

public class MAIN {
    public static void main(String[] args) {
        MenuComp menu = new MenuComp("Picada");

        Comida picada = new Comida("picadaSimple", 20, 1000, 100);
        Comida pizza = new Comida("pizza", 30, 2000, 110);

        menu.addElemento(picada);
        menu.addElemento(pizza);

        CondCosto cCosto = new CondCosto(2100);
        Cliente joaco = new Cliente("joaco", 100,cCosto);

        ArrayList <Elemento> result = menu.buscar(cCosto);
        System.out.println(result);
    }
}
