package ParcialMosquito;

import ParcialMosquito.Condiciones.Condicion;

public class MenuEspecialComp extends MenuComp{
    private Condicion cond;

    public MenuEspecialComp(String nombre,Condicion cc) {
        super(nombre);
        this.cond = cc;
    }
    public void addElemento(Elemento nueva){
        if (cond.cumple(nueva)) {
            super.addElemento(nueva);
        }
    }
    public Condicion getCond() {
        return cond;
    }

    public void setCond(Condicion cond) {
        this.cond = cond;
    }
    
    
}
