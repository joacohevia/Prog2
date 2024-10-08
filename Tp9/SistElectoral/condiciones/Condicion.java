package SistElectoral.condiciones;

import SistElectoral.Voto;

public abstract class Condicion {
    public abstract boolean cumple(Voto voto);

}
