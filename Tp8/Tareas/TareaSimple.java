package Tareas;

public class TareaSimple extends Tarea{
    private String accion;
    private int tiempo;
    private int costo;
    
    public TareaSimple(String accion, int tiempo, int costo) {
        this.accion = accion;
        this.tiempo = tiempo;
        this.costo = costo;
    }
    public boolean esSimple() {
        return true; 
    }
    public String getAccion() {
        return accion;
    }
    public void setAccion(String accion) {
        this.accion = accion;
    }
    public int getTiempo() {
        return tiempo;
    }
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    public int getCosto() {
        return costo;
    }
    public void setCosto(int costo) {
        this.costo = costo;
    }
    @Override
    public int costo() {
        return getCosto();
    }
    @Override
    public int tiempo() {
        return getTiempo();
    }
    @Override
    public String toString() {
        return "accion: " + accion;
    }

    
}
