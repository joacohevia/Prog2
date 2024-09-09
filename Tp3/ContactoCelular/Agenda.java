package Tp3.ContactoCelular;
import java.util.ArrayList;

public class Agenda {
    private ArrayList <Contacto> contactos;
    private ArrayList <Contacto> contacNumRep;

    public Agenda() {
        this.contactos = new ArrayList<>();
        this.contacNumRep = new ArrayList<>();
    }
    
    public ArrayList<Contacto> listado(){
        //nombre,apellido,edad,ciudad,telefono
        ArrayList<Contacto> contactosList = new ArrayList<>();
        for (int i=0; i<contactos.size(); i++) {
            Contacto cont = contactos.get(i);
            contactosList.add(cont);
            //agrego y devuelvo un array?
        }
        return contactosList;
    }

    public ArrayList<Contacto> listRepetidos(){ 
        //MISMO NOMBRE APELLIDO NUM TELEFONO
        ArrayList <Contacto> contactosRep = new ArrayList<>();
        for (int i =0; i<contactos.size(); i++) {
            Contacto c = contactos.get(i);
            for(int j=i+1; j<contactos.size(); j++){
                Contacto c1 = contactos.get(j);
                if (c.getTelefono()==c1.getTelefono()) {
                    contacNumRep.add(c1);
                    if (c.getNombre().equals(c1.getNombre()) && 
                        c.getApellido().equals(c1.getApellido())){
                            Contacto cont = contactos.get(i);
                            contactosRep.add(cont);
                    }
                }
            }
        }
        return contactosRep;
    }

    public double promEdad(){
        int totalEdad=0;
        for(int i=0; i<contactos.size();i++){
            Contacto c = contactos.get(i);
            totalEdad += c.getEdad();
        }
        int totalCont  = contactos.size();
        double prom = (double) totalEdad/totalCont;
        return prom;
        //puedo usar el mismo recorrido asi no hago ms for?
    }

    //agrega mas de un contacto a la ves, 
    public void agregarContactos(Contacto... nuevosContactos) {
        for (Contacto c : nuevosContactos) {
            contactos.add(c);
        }
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

    public ArrayList<Contacto> getContacNumRep() {
        return contacNumRep;
    }

    public void setContacNumRep(ArrayList<Contacto> contacNumRep) {
        this.contacNumRep = contacNumRep;
    }
    
    
}
