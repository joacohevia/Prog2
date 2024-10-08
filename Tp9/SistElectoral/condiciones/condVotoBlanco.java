package SistElectoral.condiciones;

import SistElectoral.Voto;

public class condVotoBlanco extends Condicion{

    @Override
    public boolean cumple(Voto voto) {
        return voto.getCandidato() == null;
    }
    
}
