package Tareas;

import java.util.ArrayList;

public class TareaCompMetal extends TareaCompuesta{
    private static int extra=15;
    private ArrayList <Tarea> tareaMet;

    public TareaCompMetal(String especialidad) {
        super(especialidad);
        tareaMet = new ArrayList<>();
    }
 @Override
    public int tiempo() {
        int tiempo = 0;
        for (Tarea tt : tareaMet) {
            tiempo += tt.tiempo();
            if (tt.esSimple()) {
                tiempo += extra; // Sumar 10 minutos si la tarea es simple
            }
        }
        return tiempo;
    }
    
}
