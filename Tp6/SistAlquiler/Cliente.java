package Tp6.SistAlquiler;
import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private int dni;
    private ArrayList <Alquilar> listaAlq;
    

    public Cliente(String nom, int dni) {
        this.nombre = nom;
        this.dni = dni;
        this.listaAlq = new ArrayList<>();
    }
    public void alquilarItem(Alquilar item, LocalDate fechaLimit){
        if (item.estaDisponible()) {
            item.alquilarACliente(this); // Asigna el cliente al ítem alquilado
            listaAlq.add(item);
            System.out.println(getNombre() + " alquilo: " + item.toString());
        } else {
            System.out.println("El producto: "+item.toString()+" no está disponible para alquiler.");
        }
    }
    public void addListaAlquiler(Alquilar aa){
        this.listaAlq.add(aa);
    }
    

    public boolean alquileresVencidos() {
        for (Alquilar item : listaAlq) {
            if (item.getFechaDevolucion().isBefore(LocalDate.now())) {
                return true;
            }
        }
        return false;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    @Override
    public String toString() {
        return "Cliente nombre=" + nombre + ", dni=" + dni + "]";
    }
    public ArrayList<Alquilar> getListaAlq() {
        return listaAlq;
    }
  
    
}