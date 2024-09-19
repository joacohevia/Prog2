public class Proceso extends ElementoComp{
    private double reqMemoria;
    public Proceso(double reqMemoria){
        this.reqMemoria=reqMemoria;
 
    }
    public double getReqMemoria() {
        return reqMemoria;
    }
   
    @Override
    public double getRecurso() {
       return this.getReqMemoria();
    }
    @Override
    public String ejecutar() {
        return "Proceso con memoria: " + this.getRecurso();
    }
   
}
