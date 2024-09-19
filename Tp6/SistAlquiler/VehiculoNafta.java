package Tp6.SistAlquiler;

import java.time.LocalDate;

public class VehiculoNafta extends Vehiculo{
    
    public VehiculoNafta(String marca,int km, int patente,LocalDate fecha){
        super(marca, km, patente,fecha);
    }

    @Override
    public String getTipoCombustible() {
        return "Nafta";
    }
    
}
