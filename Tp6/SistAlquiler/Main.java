package Tp6.SistAlquiler;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Sistema sist = new Sistema();
        LocalDate fechaVencida = LocalDate.of(2023, 1, 1);
        LocalDate fechaValida = LocalDate.of(2024, 9, 18);

        Cliente cl1 = new Cliente("juan", 232425);
        Cliente cl2 = new Cliente("juanito", 23233);
        sist.addClientes(cl1);
        sist.addClientes(cl2);

        Pelicula pl1 = new Pelicula("Indiana jones", "accion", 2005, 1, fechaVencida);
        VehiculoElectrico autoElec = new VehiculoElectrico("Tesla", 20000, 198123, fechaValida);

        cl2.alquilarItem(pl1,fechaVencida);
        cl1.alquilarItem(pl1, fechaVencida);
        cl1.alquilarItem(autoElec, fechaValida);
        cl1.alquilarItem(autoElec, fechaVencida);


        sist.mostrarAlquileresVencidos();
      
        sist.imprimirClientes();

    }
}
