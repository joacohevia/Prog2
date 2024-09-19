package Tp6.SistAlquiler;

import java.time.LocalDate;

public class VehiculoGasoil extends Vehiculo{

    public VehiculoGasoil(String marca, int km, int patente,LocalDate fecha) {
        super(marca, km, patente,fecha);
    }

    @Override
    public String getTipoCombustible() {
        return "Gasoil";
    }

    
}
