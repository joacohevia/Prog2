package Futbol5;

import java.time.LocalDate;

public class Alquiler {
    private LocalDate fecha;
    private int id;
    private int precio;
    @Override
    public String toString() {
        return "Alquiler [fecha=" + fecha + ", id=" + id + ", precio=" + precio + "]";
    }
    public Alquiler(LocalDate fecha, int id, int precio) {
        this.fecha = fecha;
        this.id = id;
        this.precio = precio;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
}
