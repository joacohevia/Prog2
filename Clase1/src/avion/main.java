package avion;
import java.time.LocalDate;

public class main {

	public static void main(String[] args) {
		Persona p1 = new Persona(43247209);
		Persona p2 = new Persona(43247209,"Joaquin Hevia");
		Persona p3 = new Persona(43247209,"Rama", 22, LocalDate.of(2001, 8, 18),"M",78,1.73);
		
		System.out.println("DNI: " + p1.getDni());
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Sexo: " + p1.getSexo());
        System.out.println("Peso: " + p1.getPeso());
        System.out.println("Altura: " + p1.getAltura());
        System.out.println("IMS: " + p1.getMasaCorporal());
        System.out.println("------------");
		System.out.println("DNI: " + p2.getDni());
        System.out.println("Nombre: " + p2.getNombre());
        System.out.println("Sexo: " + p2.getSexo());
        System.out.println("Peso: " + p2.getPeso());
        System.out.println("Altura: " + p2.getAltura());
        System.out.println("IMS: " + p2.getMasaCorporal());

        
        System.out.println("----------");
        
		System.out.println("DNI: " + p3.getDni());
        System.out.println("Nombre: " + p3.getNombre());
        System.out.println("Sexo: " + p3.getSexo());
        System.out.println("Peso: " + p3.getPeso());
        System.out.println("Altura: " + p3.getAltura());
        System.out.println("IMS: " + p3.getMasaCorporal());
        System.out.println("Estado: " + p3.getForma());
        if(p3.cumple()) {
        	System.out.println("feliz cumple");
        }else {
        	System.out.println("aun falta para tu cumple");
        }
        if(p3.esMayor()) {
        	System.out.println("es mayor");
        }else {
        	System.out.println("es menor");
        }
        if(p3.edadCalculada()) {
        	System.out.println("coherente");
        }else {
        	System.out.println("no coherente");
        }

        
        //System.out.println(p1);//muestra todo en una linea

        
       
        



		
		
		
		
		/*Avion1 p1111 = new Avion1();
		Avion1 p2 = new Avion1("rojo");
		Avion1 p33 = new Avion1("azul","boering",120,110);
		//Avion1 p44 = new Avion1 ("chevrolet",120,"rojo");
		
		System.out.println(p1111.getCapacidad());
		System.out.println(p1111.getCantidadAsientos());
		System.out.println(p1111.getColor());
		System.out.println(p1111.getMarca());
		System.out.println("----");
		System.out.println(p2.getCapacidad());
		System.out.println(p1111.getCantidadAsientos());
		System.out.println(p2.getColor());
		System.out.println(p1111.getMarca());
		System.out.println(p1111.getBalance());
		
		System.out.println("----");
		System.out.println(p33.getCapacidad());
		System.out.println(p1111.getCantidadAsientos());
		System.out.println(p33.getColor());
		System.out.println(p33.getMarca());
		System.out.println("----");
		System.out.println(p44.getMarca());
		System.out.println(p44.getCantidad());
		System.out.println(p44.getColor());*/

	}

}
