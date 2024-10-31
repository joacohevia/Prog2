package ParcialSIS;

import java.util.ArrayList;

import ParcialSIS.Condiciones.Condicion;

public abstract class Elemento {
    public abstract int getCantidadCamas();
    public abstract ArrayList <Elemento> getCamDisponibles(Paciente pp);
    public abstract Elemento getCopia(Condicion cc);
}
