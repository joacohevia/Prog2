package Personajes;

public abstract class Fruta{
    protected String nombre;

    
    public Fruta(String nombre) {
        this.nombre = nombre;
    }

    public abstract int aplicarFuerza(int peso);
    
}
