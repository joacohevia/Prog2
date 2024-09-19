package Tp6.SistAlquiler;

import java.time.LocalDate;

public abstract class Alquilar {
    protected LocalDate fechaDevolucion;
    private Cliente cc;

    public Alquilar(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }
    public void alquilarACliente(Cliente cliente) {
        this.cc = cliente;
    }
    public abstract boolean estaDisponible();
}
    
    

