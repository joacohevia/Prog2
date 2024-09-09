import java.util.ArrayList;

public class ColeccionDeElementos {

	Object[] datos;
	int cant;
	
	public ColeccionDeElementos() {
		datos = new Object[10];
		cant = 0;
	}
	
	public void add(Object o1) {
		
		datos[cant]= o1;
		cant++;
		if (cant ==datos.length) {
			Object[] aux = new Object[datos.length*2];
			for(int i = 0; i< datos.length; i++) {
				aux[i]= datos[i];
			}
			datos = aux;
		}
	}
	
	public Object get(int pos) {
		if (pos>=0 && pos<cant) {
			return datos[pos];
		} else {
			return null;
		}
	}
	
	public int size() {
		return this.cant;
	}
	
	public void remove(Object oBorrar) {
		int pos = this.getPos(oBorrar);
		if (pos!=-1) {
			this.remove(pos);
		}
	}
	public void remove(int pos) {
	
			if(pos>=0&& pos<cant) {
			for(int i = pos; i<cant-1; i++) {
				datos[i]=datos[i+1];
			}
			cant--;
		}
	
	}
	
	public boolean pertenece(Object o1) {
   	   int pos = this.getPos(o1);
	   return pos!=-1;
	}
	public int getPos(Object o1) {
		for(int i =0; i<cant; i++) {
			if (datos[i].equals(o1)) {
				return i;
			}
		}
		return -1;
	}
	
	public String toString() {
		String salida = "CDE:";
		for(int i=0; i< cant;i++) {
			salida= salida + datos[i].toString(); 
		}
		return salida;
	}
	
	public static void main(String[] args) {
		
		ColeccionDeElementos cde = new ColeccionDeElementos();
		ArrayList<Dado> list = new ArrayList();
		for(int i = 0;i<1853;i++) {
			cde.add(new Dado(i));
			list.add(new Dado(i));
		}
		
		
		System.out.println(cde.get(456));
		
		for(int j =0; j<cde.size();j++) {
			System.out.println(cde.get(j));
		}
		
		System.out.println(cde);
		
		cde.remove(1852);
		System.out.println(cde.get(10));
		
		System.out.println(cde.pertenece("Hola 1852"));
	    System.out.println(cde.getPos("Hola 1851"));
	    
	    //cde.remove();
	  System.out.println(list);
	   
	    Dado d1 = new Dado(6);
	    
	    System.out.println(list.contains(d1));
	}
}
