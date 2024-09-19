package Tp5.GastoPublico;

public class ContriComer extends Contribuyente{
    private int Precioventas;
    private int cant;

    public ContriComer(String nombre, int cod, double monto, int Precioventas, int cant) {
        super(nombre, cod, monto);
        this.Precioventas = Precioventas;
        this.cant = cant;
        this.setMontoComer(monto);
    }
    public double getPorcentajeVentas() {
        return 0.035; 
    }
    public double getPorcentajeFijo() {
        return 0.5;
    }

    public double setMontoComer(double monto){
        double total = montoVentas() + montoFijo();
        this.setMonto(total);
        return total;
    }
    public double montoVentas(){
        double totalVentas = (double) this.getPrecioVentas() * this.getCant();
        return totalVentas * getPorcentajeVentas();
    }
    public double montoFijo(){
        return (double) getMonto() * getPorcentajeFijo();
    }

    public int getPrecioVentas() {
        return Precioventas;
    }

    public void setVentas(int ventas) {
        this.Precioventas = ventas;
    }


    public int getCant() {
        return cant;
    }


    public void setCant(int cant) {
        this.cant = cant;
    }


    @Override
    public String toString() {
        return super.toString()+ "ContriComer [Precioventas=" + Precioventas + ", cant=" + cant + "]";
    }

    
}
