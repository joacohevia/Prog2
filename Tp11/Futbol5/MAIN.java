package Futbol5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class MAIN {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(2024, 1, 1);

        Socio joa = new Socio("joaco", "ahevia", 14, true);
        Socio joa1 = new Socio("bjoaco", "bhevia", 16, true);
        Socio joa2 = new Socio("bjoaco", "ahevia", 12, false);
        Socio joa3 = new Socio("ajoaco", "chevia", 11, false);


        Alquiler alq = new Alquiler(fecha, 13, 20000);
        Alquiler alq1 = new Alquiler(fecha, 2, 20000);
        Alquiler alq2 = new Alquiler(fecha, 3, 20000);
        joa.addAlquiler(alq);
        joa.addAlquiler(alq);
        
        joa1.addAlquiler(alq1);

        joa2.addAlquiler(alq);
        joa2.addAlquiler(alq);
        joa2.addAlquiler(alq);

        joa3.addAlquiler(alq2);

        Club boca = new Club();
        boca.addSocio(joa);
        boca.addSocio(joa1);
        boca.addSocio(joa2);
        boca.addSocio(joa3);

        CondCuota cuota = new CondCuota();
        Comparator<Socio> cNombre = new ComparadorNombre();

        CondEdad cEdad = new CondEdad();
        Comparator<Socio> cEdadd = new ComparadorEdad();

        CondId condid = new CondId();
        Comparator<Socio> cId = new ComparadorId();

        CondPago pago500 = new CondPago();
        Comparator<Socio> cCuota = new ComparadorCuota();
        Comparator<Socio> comp = new ComparadorCompuesto(cCuota,cNombre);
        //ordena por apellido y despues por nombre
        ArrayList <Socio> result = boca.buscarOrdenado(pago500, comp);
        System.out.println(result);
    }
}
