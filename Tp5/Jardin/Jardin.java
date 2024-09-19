package Tp5.Jardin;

import java.time.LocalDate;
import java.util.ArrayList;

public class Jardin {
    private String jardin;
    private ArrayList <Planta> plantas;

    
    public Jardin(String jardin) {
        this.jardin = jardin;
        this.plantas = new ArrayList<>();
    }
    public void agregarPlantas(Planta... pn){
        for (Planta plan : pn) {
            plantas.add(plan);
        }
    }
    public int cantArr(){
        return plantas.size();
    }

    public String getJardin() {
        return jardin;
    }

    public void setJardin(String jardin) {
        this.jardin = jardin;
    }
    public static void main(String[] args) {
        Jardin jar = new Jardin("911");
        Planta p1 = new Planta("911", "lala", "lalo", "Arg",LocalDate.of(2024, 5, 5));

        Planta p2 = new Planta("911", "lala", "lalo", "Arg",LocalDate.of(2024, 5, 5));
        Planta p3 = new Planta("911", "lala", "lalo", "Arg",LocalDate.of(2024, 5, 5));
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        jar.agregarPlantas(p1,p2,p3);
        int cant = jar.cantArr();
        System.out.println("Cant: "+cant+" origen "+p3.getPaisOrigen());
        
    }


 
    
     
}