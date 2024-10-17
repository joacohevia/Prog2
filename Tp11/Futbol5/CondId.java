package Futbol5;

public class CondId extends Condicion{

    @Override
    public boolean cumple(Socio ss) {
       return ss.alquiloCancha(13);
    }
    
}
