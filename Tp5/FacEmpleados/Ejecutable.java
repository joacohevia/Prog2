package Tp5.FacEmpleados;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado e1 = new Empleado("jj",1,100);
		EmpleadoComision e2 = new EmpleadoComision("aa", 1, 100,10000, 0.003);
		EmpleadoHoras e3 = new EmpleadoHoras("bb", 1, 100, 10, 2);
		
		Empresa ee = new Empresa();
		ee.addEmpleado(e1);
		ee.addEmpleado(e2);
		ee.addEmpleado(e3);
		
		System.out.println(ee.totalSueldos()+" s "+ee.empleados.size());
		
		System.out.println(((Empleado)e2).getSueldo());
		
		
	}

}
