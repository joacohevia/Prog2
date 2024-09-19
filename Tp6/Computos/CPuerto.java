public class CPuerto extends ElementoComp{
    String nombre;
   private CBarco barco;

   public CPuerto(){
    this.nombre="puerto";
   }
  
@Override
public double getRecurso() {
   return barco.getCarga();
}
public String cargar(CBarco b1, CCamion c1){
    barco = b1;
    return this.ejecutar()+c1.ejecutar();
}
@Override
public String ejecutar() {
   return "Capacidad de Carga del barco: "+this.getRecurso();
}
}
