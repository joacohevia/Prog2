package Futbol5;

public class CondEdad extends Condicion{
    private int edad;
    public CondEdad(){
        edad=18;
    }
    @Override
    public boolean cumple(Socio ss) {
       return ss.getEdad() < edad;
    }
    
}
