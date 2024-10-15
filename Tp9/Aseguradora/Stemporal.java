package Tp9.Aseguradora;

import java.time.LocalDate;
import java.util.ArrayList;

import Tp9.Aseguradora.Condiciones.Condicion;

public class Stemporal extends ElementoSer{
    private LocalDate f1;
    private LocalDate f2;
    private ElementoSer poliza;

    public Stemporal(LocalDate f1,LocalDate f2,ElementoSer ss) {
        this.f1 = f1;
        this.f2 = f2;
        this.poliza = ss;
    }
    @Override
    public double getMonto() {
        if(LocalDate.now().isAfter(this.f1)&&LocalDate.now().isBefore(f2)){
            return poliza.getMonto();
        }else{
            return -1;
        }
    }
    @Override
    public int getNumPoliza() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNumPoliza'");
    }

  

    @Override
    public ArrayList<Ssimple> buscar(Condicion cond) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }
    
}
