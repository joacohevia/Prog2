package PapaNoel;

import java.util.ArrayList;

public class Buzon extends ElementoBuzon{

    private ArrayList<Carta> cartasRecibidas;
    private int ninioMalo;
    public Buzon(){
        this.cartasRecibidas = new ArrayList<>();
        this.niniosBuenos = new ArrayList<>();
        this.ninioMalo = 0;
    }
    public void depositarCarta(Carta cc){
        if (!cartasRecibidas.contains(cc)) {
            if (!esNiñoBueno(cc)) {
                cc.remplazarCarbon();
                ninioMalo++;
            }
            cartasRecibidas.add(cc);
            
        }
    }
    public int cantidadCartaNiniosMalos() {
        return ninioMalo;
    }
    public boolean esNiñoBueno(Carta cc) {
        return niniosBuenos.contains(cc.getRemitente());
    }
    public void addNiniosBuenos(Ninio n1){
        niniosBuenos.add(n1);
        
    }
    
    @Override
    public int cantidadRecibidas() {
        return cartasRecibidas.size();
    }

   
    @Override
    public int cantidadRegalosCartas(String rr) {
        int total=0;
        for (Carta c : cartasRecibidas) {
            if (c.getRegalos().contains(rr)) {
                total++;
            }
        }
        return total;
    }
    @Override
    public double porcentajeRegaloCartas(String rr) {
       double total = 0;
       total = (double) this.cantidadRegalosCartas(rr)/this.cantidadRecibidas() * 100;
       return total;
    }

}
