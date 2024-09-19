import java.time.LocalDate;

public class CCamion extends CPuerto{
    LocalDate fecha;

    public CCamion(LocalDate fecha){
        this.fecha = fecha;
    }
    public LocalDate getFecha() {
        return fecha;
    }
   
    @Override
    public String ejecutar() {
      return " Camion con fecha :" + this.getFecha();
    }
}
