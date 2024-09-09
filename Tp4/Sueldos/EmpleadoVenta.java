package Tp4.Sueldos;

public class EmpleadoVenta extends EmpleadoHora{
    private int cantVent;
    private double sueldoPorVenta;

    public EmpleadoVenta(String nombre, String apellido,double sueldoPorVenta, int cantVent) {
        super(nombre, apellido);
        this.cantVent = cantVent;
        this.sueldoPorVenta = sueldoPorVenta;
    }
    @Override
    public double sueldoEmple() {
        double sueldo = super.sueldoEmple();
        return sueldo + (sueldoPorVenta * cantVent);
    }

    public int getCantVent() {
        return cantVent;
    }

    public void setCantVent(int cantVent) {
        this.cantVent = cantVent;
    }

    public double getSueldoPorVenta() {
        return sueldoPorVenta;
    }

    public void setSueldoPorVenta(double sueldoPorVenta) {
        this.sueldoPorVenta = sueldoPorVenta;
    }

    
    
}
