package Tp9.Aseguradora;

import java.util.ArrayList;

import Tp9.Aseguradora.Condiciones.Condicion;

public class Sintegrador extends ElementoSer{
    private ArrayList <ElementoSer> seguros;

    public Sintegrador(int dni) {
        super(dni);
        this.seguros = new ArrayList<>();
    }
    public ArrayList<ElementoSer> getSeguros() {
        return seguros;
    }
    public void addSeguro(ElementoSer ss) {
        // Verificamos que el seguro tenga el mismo DNI
        if (ss.getDni() == this.getDni()) {
            seguros.add(ss);
        } else {
            System.out.println("El seguro no corresponde al mismo cliente");
        }
    }
    @Override
    public double getMonto() {
        double resultado=0;
        for (ElementoSer ser : seguros) {
            resultado += ser.getMonto();
        }
        return resultado;
    }
    @Override
    public int getNumPoliza() {
        int mayor =0;
        int elemento = 0;
        for (ElementoSer elementoSer : seguros) {
            elemento = elementoSer.getNumPoliza();
            if (elemento>mayor) {
                mayor = elemento;
            }
        }
        return mayor;
    }
  

    @Override
    public ArrayList<Ssimple> buscar(Condicion cond) {
        ArrayList <Ssimple> retorno = new ArrayList<>();
        for (ElementoSer ee : seguros) {
            ArrayList <Ssimple> parcial = ee.buscar(cond);
            for (Ssimple par :parcial) {
                retorno.add(par);
            }
        }
        return retorno;
    }

    
}
