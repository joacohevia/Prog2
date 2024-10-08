package CandyCrush;

public class Ficha {
    private int fortaleza;
    private int casillero;
    private double destruccion;
    private String nombre;
    
    public Ficha(int fortaleza, int casillero, int destruccion, String nombre) {
        this.fortaleza = fortaleza;
        this.casillero = casillero;
        this.destruccion = destruccion;
        this.nombre = nombre;
    }
    public Ficha(int fortaleza, int casillero, String nombre) {
        this.fortaleza = fortaleza;
        this.casillero = casillero;
        this.nombre = nombre;
    }
    public int getFortaleza() {
        return fortaleza;
    }
    public void setFortaleza(int fortaleza) {
        this.fortaleza = fortaleza;
    }
    public int getCasillero() {
        return casillero;
    }
    public void setCasillero(int casillero) {
        this.casillero = casillero;
    }
    public double getDestruccion() {
        return destruccion;
    }
    public void setDestruccion(double destruccion) {
        this.destruccion = destruccion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "-- fortaleza=" + fortaleza + ", casillero=" + casillero + ", destruccion=" + destruccion
                + ", nombre=" + nombre + "--";
    }

    
}
