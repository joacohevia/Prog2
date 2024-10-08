package Tareas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*laclase TAREA tiene los metodos en comun que serian el tiempo() y el costo()
         * TAREA COMPUESTA hereda de tarea lo q implementa metodos y luego las demas tareas
         * heredan de tarea compuesta y sobreescriben los metodos
         */
        TareaCompuesta cocinar = new TareaCompuesta("cocinar");

        TareaSimple ordenar = new TareaSimple("ordenar elementos",10,15);
        TareaSimple batir = new TareaSimple("batir", 5, 10);

        //crea tarea con una especialidad y cuantas veces se repiten.
        //se le puede asociar tareas simples o complejas
        TareaCompRep repetir = new TareaCompRep("cocinar",3);
        repetir.addTareaRep(ordenar);
        repetir.addTareaRep(batir);

        //otra tarea compuesta que tiene una tarea de repetir y compuesta sin tarea simple
        TareaCompuesta receta = new TareaCompuesta("receta");
        receta.addTareaComp(repetir);
        receta.addTareaComp(cocinar);

        System.out.println(receta);
        System.out.println("costo de tar compuesta y tar rep "+receta.costo());
        System.out.println("tiempo de tar compuesta y tar rep "+receta.tiempo()); 

        //tarea compuesta comun
        TareaCompuesta recetaTorta = new TareaCompuesta("receta");
        TareaSimple molde = new TareaSimple("molde", 10, 5);
        TareaSimple ingrediente = new TareaSimple("ingrediente", 10, 5);
        recetaTorta.addTareaComp(molde);
        recetaTorta.addTareaComp(ingrediente);
        System.out.println("costo de tar compuesta: "+recetaTorta.costo());
        System.out.println("tiempo de tar compuesta: "+recetaTorta.tiempo()); 

        System.out.println("---------");
        int r = receta.contarTareasSimples();
        System.out.println(r);

        System.out.println("------------------------------------");
        ArrayList <Tarea> aux = repetir.ListaAcciones();
        System.out.println(aux);
    }
}
