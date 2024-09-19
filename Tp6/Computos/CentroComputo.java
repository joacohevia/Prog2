public class CentroComputo{

    //centro de computos se va a encargar de ejecutar los procesos
    private ColaProceso procesos;
    private ColaComputadora computadoras;

    public CentroComputo(){//inicializamos ambas estructuras que luego seran 1 sola.    
        procesos= new ColaProceso();
        computadoras= new ColaComputadora();
    }

    public String ejecutarProceso(){//el metodo que ejecuta el centro lo delega.
        //cada cola me devuelve su primer elemento ordenado para poder ejecutar el metodo.
        Computadora c1= computadoras.obtenerPrimera();
        Proceso p1=procesos.obtenerPrimero();
        
        if(c1!=null&&p1!=null){//significa que hay computadora y proceso para utilizar
            
            return c1.ejecutarProceso(p1);//computadora ejecuta el proceso (), pero el que tiene la responsabilidad es el Proceso..
        }
        else{return "no se pudo ejecutar";}    
    }
    //para agregar procesos y computadoras a las colas..
    public void addProceso(Proceso proceso){
        procesos.agregarProceso(proceso);
    }
    public void addComputadora(Computadora computadora){
        computadoras.agregarComputadora(computadora);
    }


    public static void main(String[] args) {
        CentroComputo centro= new CentroComputo();

        Computadora c1= new Computadora(10);
        Computadora c2= new Computadora(15);
        Computadora c3= new Computadora(20);
        Computadora c4= new Computadora(25);
        Computadora c5= new Computadora(50);
        Proceso p1= new Proceso(10);
        Proceso p2= new Proceso(15);
        Proceso p3= new Proceso(20);
        Proceso p4= new Proceso(25);
        Proceso p5= new Proceso(50);

        centro.addProceso(p1);centro.addProceso(p2);centro.addProceso(p3);centro.addProceso(p4);centro.addProceso(p5);
        centro.addComputadora(c1);centro.addComputadora(c2);centro.addComputadora(c3);centro.addComputadora(c4);centro.addComputadora(c5);
        
        System.out.println(centro.ejecutarProceso());
        System.out.println(centro.ejecutarProceso());
        System.out.println(centro.ejecutarProceso());
        System.out.println(centro.ejecutarProceso());
        System.out.println(centro.ejecutarProceso());


    }
    
}