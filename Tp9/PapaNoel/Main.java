package PapaNoel;

public class Main {
    public static void main(String[] args) {
        Ninio joacoBueno = new Ninio("Joaco","43222333");
        Ninio franMalo = new Ninio("Fran","4333332");
        Ninio emaBueno = new Ninio("ema", "3000000");

        Buzon buzon = new Buzon();//crea array de ninios buenos y otro de cartas
        Buzon buzonB = new Buzon();//heredan de entidad buzon que tiene todos los metodos

        Carta joaco = new Carta(joacoBueno);//crea array regalos
        joaco.addRegalos("bici");
        joaco.addRegalos("compu");
        joaco.addRegalos("play");
        buzon.addNiniosBuenos(joacoBueno);
        
        Carta fran = new Carta(franMalo);
        fran.addRegalos("compu");
        fran.addRegalos("bici");

        Carta ema = new Carta(emaBueno);
        ema.addRegalos("bici");
        ema.addRegalos("compu");
        buzon.addNiniosBuenos(emaBueno);
        
        buzon.depositarCarta(ema);
        buzon.depositarCarta(joaco);
        buzon.depositarCarta(fran);

        Ninio nicoBueno = new Ninio("nico", "33333");
        Carta nicoB = new Carta(nicoBueno);
        nicoB.addRegalos("compu");
        buzonB.addNiniosBuenos(nicoBueno);
        buzonB.depositarCarta(nicoB);
       

        System.out.println(buzon.cantidadCartaNiniosMalos());
		System.out.println(buzon.cantidadRecibidas());
		System.out.println(buzon.cantidadRegalosCartas("bici"));
		System.out.println(buzon.porcentajeRegaloCartas("bici"));
        System.out.println("...............................................");
        System.out.println(buzonB.cantidadCartaNiniosMalos());
		System.out.println(buzonB.cantidadRecibidas());
		System.out.println(buzonB.cantidadRegalosCartas("compu"));
		System.out.println(buzonB.porcentajeRegaloCartas("compu"));


    }
}
