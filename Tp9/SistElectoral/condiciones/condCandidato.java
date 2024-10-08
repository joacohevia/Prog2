package SistElectoral.condiciones;

import SistElectoral.Candidato;
import SistElectoral.Voto;

public class condCandidato extends Condicion{
    private Candidato candBuscado;
    
    public condCandidato(Candidato cb){
        this.candBuscado = cb;
    }

    @Override
    public boolean cumple(Voto voto) {
       return voto.getCandidato() != null && voto.getCandidato().equals(candBuscado);
    }
    
}
