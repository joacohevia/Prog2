package sistEncuesta;

public class main {

	public static void main(String[] args) {
		Compania comp = new Compania("Empresa Sancor","Gastos");
		
		Empleado emple = new Empleado("Joac","Hevi",1);
		comp.agregarEmpleado(emple);
		
		Usuario usua1 = new Usuario("Rama","NNNN",232323);
		
		
		Encuesta encuesta = emple.encuestar(usua1, 8);//hace las encuesta con el emppleador y cant preg
		
		 //imprime el numero de encuestas realizadas, como no fueron respondidas se imprime "0".
        System.out.println("encuestador 1 hizo Encuestas="+emple.cantidadEncuestasRealizadas());
        
        System.out.println("encuesta1 fue respondida:"+encuesta.encuestaRespondida());
        
       
    
        

	}

}
