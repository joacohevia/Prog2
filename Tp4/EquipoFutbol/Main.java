package Tp4.EquipoFutbol;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(1970, 5, 5);

        Seleccion selecArg = new Seleccion("Argentina");

        CuerpoTec entrenador = new Entrenador("Lionel", "Scaloni", "121212", 
        fecha, "Arg70", "Viajando");

        CuerpoTec entrenador1 = new Entrenador("Lionel", "Scaloni", "121212", 
        fecha, "Arg70", "Viajando");

        CuerpoTec masajista = new Masajista("Dardo", "Fuseneco", "343434", fecha, "Masoterapeuta", 10);

        CuerpoTec fb1 = new Futbolista("Lionel", "Messi", "247209", fecha, "Delantero", true, 500, "En concentracion");

        System.out.println("Seleccion: "+selecArg.getNombreSelec());
        System.out.println(fb1);
        fb1.disponible();
        System.out.println("-----------------");
        System.out.println(entrenador);
        selecArg.agregarCuerpoTec(entrenador);
        selecArg.agregarCuerpoTec(entrenador1);

    }
}
