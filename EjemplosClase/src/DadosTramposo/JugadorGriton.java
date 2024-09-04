package DadosTramposo;

public class JugadorGriton extends Jugador {

	public JugadorGriton(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public int tirarDados(Cubilete cc) {
		int valor = cc.tirar();
		System.out.println("SAQUE UN " + valor);
		return valor;
	}
}
