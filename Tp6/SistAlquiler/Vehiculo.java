package Tp6.SistAlquiler;

import java.time.LocalDate;

public abstract class Vehiculo extends Alquilar{
    private String marca;
    private int km;
    private int patente;
    private boolean alquilado;

    public Vehiculo(String marca, int km, int patente,LocalDate fecha) {
        super(fecha);
        this.marca = marca;
        this.km = km;
        this.patente = patente;
        this.alquilado = false;
    }
    public boolean estaDisponible(){
        if (!alquilado) {
            setAlquilado(true);
            return true;
        }
        return false;
    }
    public void alquilarVehiculo() {
        if (estaDisponible()) {
            this.setAlquilado(false);
        } else {
            System.out.println("Vehiculo no disponible " + getMarca());
        }
    }
    @Override
    public String toString() {
        return "Vehículo: " + marca + " - Patente: " + patente + " (Kilometraje: " + km + " km, Combustible: " + getTipoCombustible() + ")";
    }


    public abstract String getTipoCombustible();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getPatente() {
        return patente;
    }

    public void setPatente(int patente) {
        this.patente = patente;
    }
    public boolean isAlquilado() {
        return alquilado;
    }
    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }
    
}
