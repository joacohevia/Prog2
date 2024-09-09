package Tp4.Alarma;

public class AlarmaLum extends Alarma {
    private Luz luces;

    /*public AlarmaLum(boolean estado1, boolean estado2, boolean estado3) {
        super(estado1, estado2, estado3);
        luces = new Luz();
    }*/
    public AlarmaLum() {
        super();
        luces = new Luz();
    }

    @Override
    public boolean comprobar() { 
        if (super.comprobar()) {
            luces.encenderLuz(); // Encender luz si la alarma está activada
        }
        return true;
    }
   

    public Luz getLuces() {
        return luces;
    }

    public void setLuces(Luz luces) {
        this.luces = luces;
    }

    
}
