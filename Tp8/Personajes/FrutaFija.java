package Personajes;

public class FrutaFija extends Fruta{
    private int fuerza;

    public FrutaFija(String nombre,int fuerza) {
        super(nombre);
        this.fuerza = fuerza;
    }

    @Override
    public int aplicarFuerza(int peso) {
        return getFuerza();
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    
}
