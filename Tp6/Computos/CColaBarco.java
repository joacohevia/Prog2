import java.util.ArrayList;

public class CColaBarco {
    private ArrayList <CBarco> barcos;
    
    public CColaBarco(){
        this.barcos = new ArrayList<>();
    }
    public void addBarcos(CBarco b1){
        boolean encontroLugar=false;
        int i=0;
        
        while(!encontroLugar&&barcos.size()>0){
            if(this.esMayor(b1,barcos.get(i))){
                barcos.add(i, b1);
                encontroLugar=true;
            }
            i++;
        }
        if(!encontroLugar){
            barcos.add(b1);
        }
    }
    public boolean esMayor(CBarco b1, CBarco b2){
        return b1.getCarga()>b2.getCarga();
    }
    public CBarco obtenerPrimero(){
        if(barcos.size()>0){
            CBarco b1= barcos.get(0);
            barcos.remove(0);
            return b1;
        }else{return null;
        }
    }
}
