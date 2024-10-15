package Tp9.Aseguradora;

public class Shogar extends Ssimple{
    
    public Shogar(int numPoliza, int dni, double monto, String descripcion, double montoFijo, double porcentaje) {
        super(numPoliza, dni, monto, descripcion, montoFijo, porcentaje);
        
    }
   
    @Override
    public double getMonto() {
        double porcentajeAplicado = super.getMonto() * (super.getPorcentaje());
        return  getMontoFijo() + porcentajeAplicado;
    }
   
}
