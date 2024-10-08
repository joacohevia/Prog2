package Personajes;

public class Main {
    public static void main(String[] args) {

        Personaje p1 = new Personaje("batman", 100, 60);
        Personaje p2 = new Personaje("superman", 150, 70);
        Personaje p3 = new Personaje("ironMan", 200, 50);

        FrutaFija sandia = new FrutaFija("sandia", 100);
        FrutaPeso manzana = new FrutaPeso("manzana");
        FrutaFijoPeso naranja = new FrutaFijoPeso("naranja", 100);

        p1.ingerir(naranja);
        p1.ingerir(sandia);
        int f1 = p1.fuerza();

        p2.ingerir(naranja);
        p2.ingerir(sandia);
        int f2 = p2.fuerza();

        System.out.println(p1+" fuerza: "+f1);
        System.out.println(p2+" fuerza: "+f2);

        Barco atlanta = new Barco("atlanta");
        atlanta.addPersonBarco(p1);
        atlanta.addPersonBarco(p2);
        System.out.println(atlanta);

        Barco jack = new Barco("jack");
        jack.addPersonBarco(p3);
        jack.addPersonBarco(atlanta);
        System.out.println(jack);
    }
}
