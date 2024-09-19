public class Computadora extends ElementoComp{
    
    private double reqTiempo;

    public Computadora(double reqTiempo){
        this.reqTiempo=reqTiempo;
    }

    public double getReqTiempo(){
        return reqTiempo;
    }

    
    @Override
    public double getRecurso() {
        return getReqTiempo();
    }
    
    @Override
    public String ejecutar() {
        return "PC con velocidad: " + this.getRecurso();
    }
    public String ejecutarProceso(Proceso proceso){
       return this.ejecutar()+proceso.ejecutar();//defino el metodo para que se relacione que la computadora realizo el proceso.
    }
    

    public void setReqTiempo(double reqTiempo) {
        this.reqTiempo = reqTiempo;
    }

}

