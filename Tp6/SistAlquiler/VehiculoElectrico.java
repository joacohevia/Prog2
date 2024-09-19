package Tp6.SistAlquiler;

import java.time.LocalDate;

public class VehiculoElectrico extends Vehiculo{

    public VehiculoElectrico(String marca, int km, int patente, LocalDate fecha) {
        super(marca, km, patente,fecha);
    }
    public String getTipoCombustible(){
        return "Electrico";
    }
    
}
