package Tp4.Sueldos;

public class EmpleadoHora extends Empleado {
    private double sueldoPorHora;
    private int horas;
    
    public EmpleadoHora(String nombre, String apellido, double sueldoPorHora, int horas) {
        super(nombre, apellido);
        this.sueldoPorHora = sueldoPorHora;
        this.horas = horas;
    }
    public EmpleadoHora(String nombre, String apellido) {
        super(nombre, apellido);
    }
    @Override
    public double sueldoEmple(){
        double sueldo = super.sueldoEmple();
        return sueldo + (sueldoPorHora * horas);
    }

    public double getSueldoHora() {
        return sueldoPorHora;
    }
    public void setSueldoHora(double sueldoPorHora) {
        this.sueldoPorHora = sueldoPorHora;
    }
    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }

    
}
