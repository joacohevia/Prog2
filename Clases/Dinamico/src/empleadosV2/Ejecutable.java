package empleadosV2;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmpleadoSueldoFijo e1 = new EmpleadoSueldoFijo("jj",1,100);
		EmpleadoComision e2 = new EmpleadoComision("aa", 2,10000, 0.003);
		EmpleadoHoras e3 = new EmpleadoHoras("bb", 3,  10, 2);
		
		Empresa ee = new Empresa();
		ee.addEmpleado(e1);
		ee.addEmpleado(e2);
		ee.addEmpleado(e3);
		
		System.out.println(ee.totalSueldos());
		
		System.out.println(((Empleado)e2).getSueldo());
		
		
	}

}
