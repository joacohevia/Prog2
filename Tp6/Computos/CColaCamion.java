import java.util.ArrayList;

public class CColaCamion {
    private ArrayList <CCamion> camiones;

    public CColaCamion(){
        this.camiones = new ArrayList<>();
    }
   

    public void addCamiones(CCamion camion) {
        boolean agregado = false;
        int i = 0;

        // Recorrer la lista de camiones y buscar la posición correcta
        while (i < camiones.size() && !agregado) {
            if (this.esMayor(camion, camiones.get(i))) {
                camiones.add(i, camion);  
                agregado = true;
            }
            i++;
        }

        // Si no se insertó en el ciclo, significa que debe agregarse al final
        if (!agregado) {
            camiones.add(camion);
        }
    }


    public boolean esMayor(CCamion c1, CCamion c2){
        return c1.getFecha().isBefore(c2.getFecha());
    }
    public CCamion obtenerPrimero(){
        if (!camiones.isEmpty()) {
            CCamion c1 = camiones.get(0);
            camiones.remove(0);
            return c1;
        }
        return null;
    }
}
