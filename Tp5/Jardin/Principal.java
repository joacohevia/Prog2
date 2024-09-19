package Tp5.Jardin;

public class Principal {
	
	public static void main(String[] args) {
		System.out.println(Cliente.getContadorCliente());
		
		Cliente cl1 = new Cliente("Ariel", "Tandil");
		//Cliente.getContadorCliente();
		Cliente cl2 = new Cliente("Juan", "Tandil");
		System.out.println(cl1);
		System.out.println("------------");
		System.out.println(cl2);
	}

}
