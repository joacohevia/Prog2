import java.util.ArrayList;

public class ColaProceso {

    ArrayList<Proceso>procesos;

    public ColaProceso(){
        this.procesos=new ArrayList<>();
    }

    //de que se encarga la cola de procesos? va a agregar ordenado, y va a devolver procesos...
    public int getSize(){
        return procesos.size();
    }
    //determina tamaño de proceso, se utiliza para luego ordenar por tamaño
    public boolean esMayor(Proceso p1, Proceso p2){
        return p1.getReqMemoria()>p2.getReqMemoria();
    }
    //agrega a la cola de manera ordenada(mas adelante como Computadora y Proceso son iguales, esMayor va a ser abstracto..)
    public void agregarProceso(Proceso p1){
        boolean encontroLugar= false;
        int i=0;
        while(!encontroLugar && i<procesos.size()){    
            if(this.esMayor(p1, procesos.get(i))){
                procesos.add(i, p1);
                encontroLugar=true;
            }
            i++;
        }
        if(!encontroLugar){//si no encontro lugar es porque va al fondo
            procesos.add(p1);
        }
    }
    //obtener primera va a devolver un Proceso que luego CentroComputo lo va a ejecutar..
    public Proceso obtenerPrimero(){
        if(this.getSize()>0){//en esta solucion no necesito getSize();
            Proceso p1=procesos.get(0);//tomo el primero
            procesos.remove(0);//lo elimino
            return p1;//lo devuelvo
        }else{
            return null;//si no hay nada..
        } 
    }
}
