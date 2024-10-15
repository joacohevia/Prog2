package Tp9.Aseguradora;

import java.time.LocalDate;
import java.util.ArrayList;

import Tp9.Aseguradora.Condiciones.CondAnd;
import Tp9.Aseguradora.Condiciones.CondNombre;
import Tp9.Aseguradora.Condiciones.CondSuperior;

public class Main {
    public static void main(String[] args) {
        Ssimple segSimple = new Ssimple(1, 40, 100, "automotor");
        Ssimple segSimple1 = new Ssimple(2, 40, 200, "seg moto");

        Shogar casa = new Shogar(3, 40, 100, "automotor", 200, 0.5);
        //monto = 
        Sintegrador c1 = new Sintegrador(40);
        c1.addSeguro(segSimple1);
        c1.addSeguro(segSimple);
        c1.addSeguro(casa);
        System.out.println(c1.getMonto()+" monto casa : "+casa.getMonto());

        Stemporal segVida = new Stemporal(LocalDate.of(2024, 10, 10),LocalDate.of(2024, 10, 20)
        ,segSimple);
        System.out.println(segVida.getMonto()); 

        CondNombre cn = new CondNombre("automotor");
        CondSuperior ms = new CondSuperior(250);//249
        CondAnd cAnd = new CondAnd(cn,ms);
        ArrayList <Ssimple> rr = c1.buscar(cAnd);
        System.out.println(rr);
    }
}
