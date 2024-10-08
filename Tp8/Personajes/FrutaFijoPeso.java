package Personajes;

public class FrutaFijoPeso extends Fruta{
    public static int mult = 7;
    private int fuerzaFija;
    public FrutaFijoPeso(String nombre, int fuerzaF) {
        super(nombre);
        this.fuerzaFija = fuerzaF;
    }
    @Override
    public int aplicarFuerza(int peso) {
       return fuerzaFija + (peso*mult);
    }
    public int getFuerzaFija() {
        return fuerzaFija;
    }
    public void setFuerzaFija(int fuerzaFija) {
        this.fuerzaFija = fuerzaFija;
    }

  
    
}
