package DadosTramposo;

public class JugadorTramposo extends Jugador{
	
	DadoCargado[] cargados;
    int contador;
	public JugadorTramposo(String nombre) {
		super(nombre);
		cargados= new DadoCargado[2];
		cargados[0]= new DadoCargado(6,6);
		cargados[1]= new DadoCargado(6,5);
		contador = 0;
		
	}
	
	public int tirarDados(Cubilete cc) {
		//return cc.tirar();
		contador ++;
		if (contador <10) {
		 Dado[] bolsillo = cc.getDados();//GUARDO LOS DADOS
		 cc.setDados(cargados);//A CUBILETE LE PASO LOS DADOS CARGADOS
		 int valor = cc.tirar();//TIRA NORMAL
		 cc.setDados(bolsillo);//SETEA LOS DADOS COMUNES
		 return valor;
		 }
		else {
			contador = 0;
			return super.tirarDados(cc);
		}
	}
	
	

}
