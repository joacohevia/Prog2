package Correo;

import java.util.ArrayList;

public class ComboEnvio extends ElementoEnvio{
    private ArrayList <Carta> combos;
    public ComboEnvio(){
        this.combos = new ArrayList<>();
    }
    public void addCartasPaq(Carta cart){
        if (combos.isEmpty()) {
            combos.add(cart);
        }else{
            boolean encontro = false;
            for (Carta c : combos) {
                if (c.getCiudad().equalsIgnoreCase(cart.getCiudad()) && !encontro) {
                    encontro=true;
                }
            }
            if (encontro) {
                cambiarId(cart);
                combos.add(cart);
            }
        }
    }
    public void addCombo(ComboEnvio comb){
        if (comboCiudad(this,comb)) {
            //quiero saber cuántas cartas hay en la lista combos de este objeto comb de tipo ComboEnvio
            //comb es de tipo ComboEnvio, no una lista. Entonces no puedo llamar directamente a comb.size().
            for (int i = 0; i < comb.combos.size(); i++) {
                Carta cc = comb.combos.get(i);
                cambiarId(cc);
            }
            // Agrega todas las cartas del combo "comb" al combo actual
            combos.addAll(comb.combos);
        }
        
    }
    public boolean comboCiudad(ComboEnvio combos, ComboEnvio comb){
        return  ciudad(combos).equals(ciudad(comb));
        
    }
    public String ciudad(ComboEnvio c){
        return c.combos.get(0).getCiudad();
    }
    @Override
    public String toString() {
        return "ComboEnvio: " + imprimir() + ": peso total del combo: "+ obtenerPeso();
    }
    public String imprimir(){
        return combos.get(0).getCiudad() + " , " + combos.get(0).getRemitente()+" , "+
        combos.get(0).getDireccion();
    }
    @Override
    public double obtenerPeso() {
        double resultado=0;
        for (Carta carta : combos) {
            resultado += carta.getPeso();
        }
        return resultado;
    }

    public void cambiarId(Carta cart) {
        Carta c = combos.get(0);
        cart.setId(c.getId());
    }

}
