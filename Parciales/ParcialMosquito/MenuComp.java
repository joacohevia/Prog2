package ParcialMosquito;

import java.util.ArrayList;

import ParcialMosquito.Condiciones.Condicion;

public class MenuComp extends Elemento{
    private ArrayList <Elemento> comidas;
    private int porcentajePrecio;
    
    public MenuComp(String nombre) {
        super(nombre);
        this.porcentajePrecio = 10;
        this.comidas =  new ArrayList<>();
    }
    public void addElemento(Elemento ee){
        comidas.add(ee);
    }
    @Override
    public int getTiempo() {
       int mayor = 0;
       for (Elemento elem : comidas) {
            if (elem.getTiempo()>mayor) {
                mayor = elem.getTiempo();
            }
       }
       return mayor;
    }

    @Override
    public int getPrecio() {
        int precio = 0;
        for (Elemento elem : comidas) {
            precio += elem.getPrecio();
        }
        return precio - (precio * porcentajePrecio) / 100;// si aca porcentajePrecio es un int
        // return precio - (precio * porcentajePrecio); si aca porcentajePrecio es un double (0.1)
        //la suma - el 10% del precio total
    }

    @Override
    public int getCalorias() {
        int suma = 0;
        for (Elemento elem : comidas) {
            suma+= elem.getCalorias();
        }
        return suma;
    }

    @Override
    public ArrayList<String> getIngredientes() {
        ArrayList <String> salida = new ArrayList<>();
        for (Elemento elem : comidas) {
            ArrayList <String> aux = elem.getIngredientes();
            for (String ss : aux) {
                if (!salida.contains(ss)) {
                    salida.add(ss);
                }
            }
        }
        return salida;
    }

    @Override
    public ArrayList<Elemento> buscar(Condicion condicion) {
        ArrayList <Elemento> salida = new ArrayList<>();
        for (Elemento ele : comidas) {
            salida.addAll(ele.buscar(condicion));
        }
        return salida;
    }
 
    
    

}
