package series;

public class ColeccionObjetos {
	
	final static int INI_N = 5;
	Object[] datos;
	int n;
	
	public ColeccionObjetos() {
		this.datos = new Object[INI_N];
		this.n = 0;
	}
	
	public int getTamanio() {
		return this.n;
	}
	
	public Object obtener(int pos) {
		if (pos >= 0 && pos < this.n)
			return datos[pos];
		else
			return null;
	}
	
	public void agregar(Object o) {
		if (this.n == this.datos.length) {
			Object[] nuevo = new Object[this.n * 2];
			for (int i = 0; i < this.n; i++)
				nuevo[i] = this.datos[i];
			this.datos = nuevo;
		}
		
		this.datos[this.n] = o;
		this.n++;
	}
	
	// contains
	public boolean tieneElemento(Object o) {
		int i = 0;
		while (i < this.n && !this.datos[i].equals(o))
			i++;
		return i < this.n;
	}
	
	public static void main(String[] args) {
		ColeccionObjetos palabras = new ColeccionObjetos();
		palabras.agregar("Hola");
		palabras.agregar("esto");
		palabras.agregar("es");
		palabras.agregar("Programación");
		palabras.agregar("2");
		palabras.agregar("TUDAI");
		
		for (int i = 0; i < palabras.getTamanio(); i++)
			System.out.println(palabras.obtener(i));
		
		System.out.println(palabras.tieneElemento("TUDAI"));
		System.out.println(palabras.tieneElemento("tudai"));
	}

}
