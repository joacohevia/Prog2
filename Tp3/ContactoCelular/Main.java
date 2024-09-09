package Tp3.ContactoCelular;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Agenda agenda = new Agenda();
        Celular celu = new Celular("Xiaomi",agenda);

        Contacto cont1 = new Contacto("Bri", "Gasillon", LocalDate.of(2001,07,04), 66516258, 28, "Belgrano 758", "briGmail");
        Contacto cont2 = new Contacto("Bri", "Gasillon", LocalDate.of(2001,04,07), 66516258, 21, "Belgrano 758", "briGmail");
        Contacto cont3 = new Contacto("Joac", "hevia", LocalDate.of(2001,04,07), 66533338, 35, "Bel 758", "briGmail");
        Contacto cont4 = new Contacto("Jo", "h", LocalDate.of(2001,04,07), 66533338, 43, "Bel 758", "briGmail");

        agenda.agregarContactos(cont1,cont2,cont3,cont4);

        ArrayList<Contacto> listaContactos = agenda.listado();
        for (Contacto c : listaContactos) {
            System.out.println("CONTACTOS:---------------------------- "
            +"Nombre: "+c.getNombre()+" Apellido: "+c.getApellido()+" tel "+c.getTelefono());
            System.out.println(" direccion "+c.getDireccion()+" edad"+c.getEdad());
        }
        System.out.println("------------------------------------------");

        //PARA LLAMAR DESDE EL CELULAR TENGO QUE INSTANCIAR AGENDA EN CELU->CONSTRUC
        ArrayList<Contacto> listRep = celu.listRepetidos();
        for (Contacto cr : listRep) {
            System.out.println("CONTACTOS REPETIDOS: "
             +"Nombre: "+cr.getNombre()+" Apellido: "+cr.getApellido()+" tel "+cr.getTelefono());
            System.out.println(" direccion "+cr.getDireccion()+" edad"+cr.getEdad());
        }
        System.out.println("-----------------------------------------------");
        ArrayList<Contacto> listNumRep = celu.listNumRep();
        for (Contacto cr : listNumRep) {
            System.out.println("CONTACTOS NUM REPETIDOS: "
             +"Nombre: "+cr.getNombre()+" Apellido: "+cr.getApellido()+" tel "+cr.getTelefono());
            System.out.println(" direccion "+cr.getDireccion()+" edad"+cr.getEdad());
        }
        double prom = celu.promEdad();
        System.out.println("------- "+prom+" ----------");

    }
}
