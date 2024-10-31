package ParcialSIS.Condiciones;

import ParcialSIS.Paciente;

public class CondEdad extends Condicion{

    @Override
    public boolean cumple(Paciente pp) {
        return pp.getEdad() > 25;
    }
    
}
