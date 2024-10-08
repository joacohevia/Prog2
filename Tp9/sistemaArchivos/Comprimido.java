package sistemaArchivos;

import java.util.ArrayList;

import sistemaArchivos.condiciones.Condicion;

public class Comprimido extends Directorio{

    private double tasaCompresion;
    public Comprimido(String nombre, double tasa) {
        super(nombre);
        this.tasaCompresion = tasa;
    }

    @Override
    public double getTamanio() {
        return super.getTamanio()*tasaCompresion;
    }

    @Override
    public int cantElementos() {
        return 1;
    }

    public ArrayList<Archivo> buscar(Condicion condicion) {
        return new ArrayList<>();
    }
}
