package Tp4.Sueldos;
import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList <Empleado> empleados;
    private ArrayList <EmpleadoHora> empleadoHoras;
    private ArrayList <EmpleadoVenta> empleadoVentas;

    public Empresa(String nom){
        this.nombre = nom;
        this.empleados = new ArrayList<>();
        this.empleadoHoras = new ArrayList<>();
        this.empleadoVentas = new ArrayList<>();
    }
      public void agregarEmple(Empleado... emp){
        for (Empleado e : emp) {
            empleados.add(e);
        }
    }

    public void agregarEmpleH(EmpleadoHora... emp){
        for (EmpleadoHora e : emp) {
            empleadoHoras.add(e);
        }
    }
    public void agregarEmpleV(EmpleadoVenta... emp){
        for (EmpleadoVenta e : emp) {
            empleadoVentas.add(e);
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<EmpleadoHora> getEmpleadoHoras() {
        return empleadoHoras;
    }

    public void setEmpleadoHoras(ArrayList<EmpleadoHora> empleadoHoras) {
        this.empleadoHoras = empleadoHoras;
    }

    public ArrayList<EmpleadoVenta> getEmpleadoVentas() {
        // Crear una nueva lista para la copia
        ArrayList<EmpleadoVenta> copia = new ArrayList<>();
        // Iterar sobre el ArrayList original y clonar cada EmpleadoVenta
        for (EmpleadoVenta empleado : empleadoVentas) {
            copia.add(empleado); // Clonar el empleado y añadirlo a la copia
        }
        // Devolver la lista clonada
        return copia;
    }

    public void setEmpleadoVentas(ArrayList<EmpleadoVenta> empleadoVentas) {
        this.empleadoVentas = empleadoVentas;
    }
    
}
