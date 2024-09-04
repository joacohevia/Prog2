package avion;
import java.time.LocalDate;


public class Persona {
	private String nombre;
	private int edad;
	private LocalDate fecha_nacimiento;
	private int dni;
	private String sexo;
	private double peso;
	private double altura;
	private double masaCorporal;
	private int mayorA=18;
	
	public Persona(int dni) {
		this(43247209,"NN",23,LocalDate.of(2000, 1, 1),"F",1,1);
	}
	
	public Persona(int dni, String nombre) {
		this(dni);
		this.setNombre(nombre);
	}
	
	public Persona(int dni, String nombre, int edad, LocalDate fecha_nacimiento, String sexo,
			double peso, double altura) {
		this.dni = dni;
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setFecha_nacimiento(fecha_nacimiento);
		this.setSexo(sexo);
		this.setPeso(peso);
		this.setAltura(altura);
	}
	public boolean edadCalculada() {
		LocalDate hoy = LocalDate.now();
		int edadCalcu = hoy.getYear() - fecha_nacimiento.getYear();
		//primero compara los meses y dice si es mes este es menor al del nacimiento o es igual
		// compara los dias y si hoy es menor le resta por q aun no es su cumpleaños
		 if (hoy.getMonthValue() < fecha_nacimiento.getMonthValue() || (hoy.getMonthValue() == fecha_nacimiento.getMonthValue()
				 && hoy.getDayOfMonth() < fecha_nacimiento.getDayOfMonth())) {
			    edadCalcu--; 
		 }
		 if(edadCalcu == this.edad) {
			 return true;
		 }else {
			 return false;
		 }
	}
	
	public String toString() {
		 return "p1("+nombre+","+edad+","+fecha_nacimiento+")";//funcion para mostrar todo en una linea
	 }
	public boolean esMayor() {
		if(this.edad>mayorA) {
			return true;
		}else {
			return false;
		}
	}
	
	//● Saber si está cumpliendo años. 
	public boolean cumple() {
		LocalDate hoy = LocalDate.now();
		return hoy.getMonth() == fecha_nacimiento.getMonth() && hoy.getDayOfMonth() == fecha_nacimiento.getDayOfMonth();
	}
	
	public double getMasaCorporal() {
		masaCorporal =  peso /  (altura*altura);
		return masaCorporal;
	}
	public String getForma() {
		if(masaCorporal >= 18.5 && masaCorporal <=25) {
			return "en forma";
		}else {
			return "no esta en forma";
		}
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
		
	}

	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public int getDni() {
		return dni;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
