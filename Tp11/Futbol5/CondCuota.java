package Futbol5;

public class CondCuota extends Condicion{
        @Override
        public boolean cumple(Socio socio) {
            return !socio.isPago();  // Retorna true si el socio tiene la cuota impaga
        
    }
}
