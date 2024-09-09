package Tp4.Sueldos;

public class Empleado {
    private String nombre;
    private String apellido;
    protected static final int SEMANA = 5;
    protected static final int SUELDO_DIA = 25000;

    public Empleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public double sueldoEmple(){
        return (double) SUELDO_DIA * SEMANA;
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
    
}
