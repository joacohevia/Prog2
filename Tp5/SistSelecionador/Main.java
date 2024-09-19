package Tp5.SistSelecionador;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Sist sistema = new Sist();

        ArrayList <String> habilidadesAlum = new ArrayList<>();
        habilidadesAlum.add("valentia");
        habilidadesAlum.add("coraje");

        ArrayList <String> habilidadesCasa1 = new ArrayList<>();
        habilidadesCasa1.add("valentia");
        habilidadesCasa1.add("coraje");

        ArrayList <String> familiares = new ArrayList<>();
        familiares.add("harrys2");
        
        Alumno alum1 = new Alumno("Harry", habilidadesAlum, familiares, false);

        Casa casaAlum1 = new Casa("casa1",habilidadesCasa1, 5, false);

        Alumno alum2 = new Alumno("Harry2", habilidadesAlum, familiares, false);

        Casa casaAlum2 = new Casa("casa2",habilidadesCasa1, 5, true);
        
        sistema.asignarAlumCasa(alum1, casaAlum1);
        sistema.asignarAlumCasa(alum2, casaAlum1);
        //primero agrego alum a una casa sin familiar y luego si puedo agregar con familiar
        sistema.asignarAlumCasa(alum2, casaAlum2);

    }
}
