package Futbol5;

import java.util.ArrayList;

public class Socio {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean pago;
    private ArrayList <Alquiler> alquileres;
    
    public Socio(String nombre, String apellido, int edad, boolean pago) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pago = pago;
        this.alquileres = new ArrayList<>();
    }
    public void addAlquiler(Alquiler aa){
        alquileres.add(aa);
    }
    public boolean pagoMayor(int pp){
        for (Alquiler alquiler : alquileres) {
            if (alquiler.getPrecio()>pp) {
                return true;
            }
        }
        return false;
    }
    public int getCantidadAlquileres (int aa){
        int total = 0;
        for (Alquiler alquiler : alquileres) {
            if (alquiler.getId() == aa) {
                total ++;
            }
        }
        return total;
    }
    
    public boolean alquiloCancha(int aa){
        for (Alquiler alquiler : alquileres) {
            if (alquiler.getId() == aa) {
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Socio [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", pago=" + pago;
    }
    public ArrayList<Alquiler> getAlquileres() {
        return alquileres;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public boolean isPago() {
        return pago;
    }
    public void setPago(boolean pago) {
        this.pago = pago;
    }

    
}
