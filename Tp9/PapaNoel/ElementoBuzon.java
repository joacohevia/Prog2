package PapaNoel;

import java.util.ArrayList;

public abstract class ElementoBuzon {

    public ArrayList<Ninio> niniosBuenos;
    public abstract int cantidadRecibidas();
    public abstract int cantidadCartaNiniosMalos();
    public abstract int cantidadRegalosCartas(String rr);
    public abstract double porcentajeRegaloCartas(String rr);
   
}