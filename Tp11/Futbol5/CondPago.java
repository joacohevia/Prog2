package Futbol5;

public class CondPago extends Condicion{
    private int pago = 500;
    @Override
    public boolean cumple(Socio ss) {
       return ss.pagoMayor(pago);
    }
    
}
