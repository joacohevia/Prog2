package EjercicioNavidad;

public class Ejecutable {

	public static void main(String[] args) {
		
		Carta ninoBueno1 = new Carta("39341670");
		Carta ninoBueno2 = new Carta("34567890");
		
		Carta ninoMalo1 = new Carta("23567890");
		Carta ninoMalo2 = new Carta("18976778");
		
		ninoBueno1.addRegalo("bicicleta");
		ninoBueno1.addRegalo("autito");
		
		ninoBueno2.addRegalo("bicicleta");
		ninoBueno2.addRegalo("pistola");
		
		ninoMalo1.addRegalo("ametralladora");
		ninoMalo1.addRegalo("granada");
		ninoMalo1.addRegalo("bazooka");
		
		ninoMalo2.addRegalo("ametralladora");
		ninoMalo2.addRegalo("granada");
		ninoMalo2.addRegalo("bazooka");
		
		BuzonSimple b1 = new BuzonSimple();
		b1.addNinoBueno("39341670");
		b1.addNinoBueno("34567890");
		b1.addCarta(ninoBueno1);
		b1.addCarta(ninoBueno2);
		b1.addCarta(ninoMalo1);
		b1.addCarta(ninoMalo2);
		
		System.out.println(b1.getCantidadCartasDeterminadoRegalo("bicicleta"));
		System.out.println(b1.getCantidadNinosMalosEnviaronCarta());
		System.out.println(b1.getCantidadRecibidas());
		System.out.println(b1.getPorcentajeCartasDeterminadoRegalo("bicicleta"));
		
		
		
		
	}
}
