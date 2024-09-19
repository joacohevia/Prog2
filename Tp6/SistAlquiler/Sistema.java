package Tp6.SistAlquiler;
import java.util.ArrayList;
public class Sistema {
    private ArrayList <Cliente> clientes;

    public Sistema(){
        this.clientes = new ArrayList<>();

    }
    public void imprimirClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            System.out.println("Clientes registrados en el videoclub:");
            for (Cliente cliente : clientes) {
                System.out.println(cliente.toString()); // O usa otro método si quieres más detalles
            }
        }
    }
    public void mostrarAlquileresVencidos() {
        System.out.println("Clientes con alquileres vencidos:");
        for (Cliente cliente : clientes) {
            if (cliente.alquileresVencidos()) {
                System.out.println(cliente.toString());
            }
        }
    }
    
    public void addClientes(Cliente cc){
        if (!clientes.contains(cc)) {
            clientes.add(cc);
        }
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    

}
