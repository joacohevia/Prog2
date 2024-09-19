package Tp5.GastoPublico;

public class ContriProg extends ContriComer{

    public ContriProg(String nombre, int cod, int monto, int Precioventas, int cant){
        super(nombre, cod, monto,Precioventas,cant);
    }
  
    public double getPorcentajeVentas() {
        return 0.2; 
    }

    public double getPorcentajeFijo() {
        return 0.2; 
    }
    //aca hago calculador
}
