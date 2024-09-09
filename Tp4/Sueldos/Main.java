package Tp4.Sueldos;

public class Main {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa("Google");

        Empleado empleContra = new Empleado("Joaquin", "Hevia");
        Empleado empleHora = new EmpleadoHora("Nico","papaleo",15000,3);
        Empleado empleVenta = new EmpleadoVenta("Pancho", "Vazquez",17000,5);

        empresa1.agregarEmple(empleContra,empleHora,empleVenta);

        System.out.println("Nombres: "+empleContra.getNombre()+" | "+empleHora.getNombre()+" | "+empleVenta.getNombre());
        System.out.println("Sueldos: "+empleContra.sueldoEmple()+" |"+empleHora.sueldoEmple()+" | "+empleVenta.sueldoEmple());


    }
}
