package SistElectoral;

import SistElectoral.condiciones.Condicion;

public abstract class ElementoElec {
    public abstract double porcentajeVoto(Condicion cc);
    public abstract int votosTotal();
}
