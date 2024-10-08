package CandyCrush;

public class FichaEspecial extends Ficha{
    private double destruccion;

    public FichaEspecial(int fortaleza, int casillero, String nombre){
        super(fortaleza,casillero,nombre);
        setDestruccion(calcularDestruccion(fortaleza, casillero));
    }

    public double calcularDestruccion(int fortaleza,int casillero){
        double resultado = 0.0;
        return resultado = (double) getFortaleza()/getCasillero();
    }

    public double getDestruccion() {
        return destruccion;
    }

    public void setDestruccion(double destruccion) {
        this.destruccion = destruccion;
    }

    @Override
    public String toString() {
        return "-- FichaEspecial [destruccion=" + destruccion + "]";
    }
 
    
}
