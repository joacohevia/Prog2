package CandyCrush;

import java.util.ArrayList;

import CandyCrush.Condiciones.CondDestrucMayor;

public class Main {
    public static void main(String[] args) {
        Tablero candy = new Tablero(10);

        Ficha f1 = new Ficha(3, 2, 3, "chocolate");
        Ficha f2 = new Ficha(5, 1, 1, "piedra");

        FichaEspecial fichaEspe = new FichaEspecial(10, 2, "montapuercos");

        candy.addFicha(f1);
        candy.addFicha(f2);
        candy.addFicha(fichaEspe);

        candy.CalcularDificultad();
          
        System.out.println(candy);
        CondDestrucMayor cond1 = new CondDestrucMayor();
        ArrayList <Ficha> resultado =candy.buscar(cond1);
        System.out.println("Fichas mayor a 2: "+resultado);
       
    }
}
