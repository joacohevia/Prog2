package centroDeComputos;

public class Computadora extends Elemento{
    private int inventario;
    private String sala;
    private double velocidad;

    private Proceso procEjecutando;

    public Computadora(int inventario, String sala, double velocidad) {
        this.inventario = inventario;
        this.sala = sala;
        this.velocidad = velocidad;
        this.procEjecutando = null;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void asignarProceso(Proceso p) {
        procEjecutando = p;
    }

    public void liberar(){
        procEjecutando = null;
    }

    @Override
    public boolean mayor(Elemento otro) {
        return this.getVelocidad() > ((Computadora)otro).getVelocidad();
    }

    @Override
    public String toString(){
        return this.getInventario()+" ("+this.getVelocidad()+")";
    }
}
