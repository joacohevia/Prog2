package Parcial2021;

import java.util.ArrayList;
import java.util.Collections;

import comparador.CompCiudadOrigen;
import comparador.CompCosto;
import comparador.CompCostoFecha;
import comparador.CompCostoPasa;
import cond.CondDestino;

public class Main {
    public static void main(String[] args) {
    PaqueteSimple amigos = new PaqueteSimple(1, 5, "mar del plata", "cancun", 100, "asd");
    PaqueteSimple familia = new PaqueteSimple(2, 5, "cancun", "bariloche", 200, "asd");


    PaqCompuesto pack = new PaqCompuesto(3, 5);
    pack.addPaquete(amigos);
    pack.addPaquete(familia);
    System.out.println(pack.tieneEle());
    //a) Listar todos los paquetes cuyo destino sea “Cancún”, ordenados por ciudad de origen,
    // y luego por identificador, si hay más de un paquete con la misma ciudad de origen.
    CondDestino condDest = new CondDestino("cancun");
    CompCiudadOrigen compCiudad = new CompCiudadOrigen();
    ArrayList <PaqViaje> result = pack.buscar(condDest);
    Collections.sort(result,compCiudad);
    //LA CONDICION TIENE POR PARAMETRO PAQVIAJE(ABSTRAC)PORQUE CORROBORA QUE EL MISMO SE AGREGUE
    //O NO
    System.out.println(result);

    /*b) Listar todos los paquetes cuyo origen sea “Tandil” y cuyo destino sea “Bariloche” ,
     ordenados por costo del paquete.*/
     //La condicion origen ya la tengo debo hacer un and con destino
     //comparador costo
     CompCosto comCosto = new CompCosto();
     Collections.sort(result,comCosto);
    
    //c) Listar todos los paquetes con costo mayor a $100.000, ordenados por costo y, si hay dos
    //paquetes con el mismo costo, y luego por fecha acordada de pago (los que no tienen fecha
    //acordada deben ir a lo último).-> para que lo agregue a lo ultimo debo return -1
    //CondCosto ya lo tengo.
    CompCostoFecha ccCosFec = new CompCostoFecha();

    //d) Listar todos los paquetes con fecha acordada 25 de Mayo de 2022, ordenados por costo y, si hay
    //dos paquetes con el mismo costo, y luego por cantidad de pasajeros.
    //CondFecha, comparador costo distinto
    CompCostoPasa ccc = new CompCostoPasa();
    //e) Se pueden agregar nuevos tipos de búsquedas así como también combinaciones lógicas de las
    //mismas. Los criterios de ordenamiento también pueden variar y deben poder combinarse de
    //cualquier manera.
    
    }
}
