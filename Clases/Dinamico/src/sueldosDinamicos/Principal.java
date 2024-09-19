package sueldosDinamicos;

public class Principal {
	public static void main(String[] args) {
		Empleado e1 = new Empleado("Ariel", 100, 0, 10, 0.1, 150, 
				new CalculadorDeSueldo());
		Empleado e2 = new Empleado("Ariel", 500, 100, 120, 0.1, 150, 
				new CalculadorDeSueldo());
		
		Empresa tudai = new Empresa();
		tudai.addEmpleado(e1);
		tudai.addEmpleado(e2); // No lo agrega pq es "igual" (tiene el mismo nombre) que e1
		
		System.out.println("Total a pagar " + tudai.calcularSueldos());
		
		e1.setCalculador(new CalculadorPorHorasExtras()); // Cambia en tiempo de ejecución la forma de calcular el sueldo
		
		System.out.println("Total a pagar " + tudai.calcularSueldos());
		
	}
}
