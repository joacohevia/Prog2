import java.util.ArrayList;

public class ColaComputadora {

    private ArrayList<Computadora>computadoras;

    public ColaComputadora(){
        this.computadoras= new ArrayList<>();
    }

    //de que se va a encargar la cola de computadoras? es una estructura que va a tener ordenado sus elementos Computadora
    //tiene que saber agregarlos ordenados y tambien devolver la primera computadora disponible;
    //para repasar, la computadora que llegue, debe ser agregada segun el orden en el que la cola dispone la estructura.
    public void agregarComputadora(Computadora c1){
        boolean encontroLugar=false;
        int i=0;
        
        while(!encontroLugar&&computadoras.size()>0){
            if(this.esMayor(c1,computadoras.get(i))){
                computadoras.add(i, c1);
                encontroLugar=true;
            }
            i++;
        }
        if(!encontroLugar){
            computadoras.add(c1);
        }

    }

    public boolean esMayor(Computadora c1, Computadora c2){
        return c1.getReqTiempo()>c2.getReqTiempo();
    }

    public Computadora obtenerPrimera(){
        if(computadoras.size()>0){
            Computadora c1= computadoras.get(0);
            computadoras.remove(0);
            return c1;
        }else{return null;
        }
    }

    public int getSize(){
        return computadoras.size();
    }
}
