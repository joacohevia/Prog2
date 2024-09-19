package Tp5.GastoPublico;

public class Contribuyente {
    private String nombre;
    private int cod;
    private double monto;
    
    public Contribuyente(String nombre, int cod, double monto) {
        this.nombre = nombre;
        this.cod = cod;
        this.monto = monto;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Contribuyente nombre=" + nombre + ", cod=" + cod + ", monto=" + monto + "]";
    }

    
}
