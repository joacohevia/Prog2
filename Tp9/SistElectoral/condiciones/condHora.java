package SistElectoral.condiciones;

import java.time.LocalTime;

import SistElectoral.Voto;

public class condHora extends Condicion{
   private LocalTime horaIni;
   private LocalTime horaFin;

   public condHora(){
    this.horaIni = LocalTime.of(10, 0, 0);
    this.horaFin = LocalTime.of(11, 0, 0);
   }

    @Override
    public boolean cumple(Voto voto) {
        return voto.getHora().isAfter(horaIni) && voto.getHora().isBefore(horaFin);
    }
    
}
