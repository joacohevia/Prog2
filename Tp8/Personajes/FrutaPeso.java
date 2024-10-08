package Personajes;

public class FrutaPeso extends Fruta{
    public static int mult = 10;

    public FrutaPeso(String nombre) {
        super(nombre);
    }

    @Override
    public int aplicarFuerza( int peso) {
        return peso * mult;
    }
     
}
