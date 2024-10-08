package Computos2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Elementos extends Condicion{
    ArrayList <Elementos> elementos;

    public Elementos(){
        elementos = new ArrayList<>();
    }
    public void addElementos(Elementos elemen) {
        boolean agregado = false;
        int i = 0;
        // Recorrer la lista de camiones y buscar la posición correcta
        while (i < elementos.size() && !agregado) {
            if (esMayor(elemen, elementos.get(i))) {
                elementos.add(i, elemen);  
                agregado = true;
            }
            i++;
        }
        // Si no se insertó en el ciclo, significa que debe agregarse al final
        if (!agregado) {
            elementos.add(elemen);
        }
    }
    public boolean esMayor(Elementos e1, Elementos e2){
        return c1.getFecha().isBefore(c2.getFecha());
    }
    public Elementos obtenerPrimero(Class<?> element){
        if (!elementos.isEmpty()) {
            for (int i = 0; i < elementos.size(); i++) {
                Elementos e1 = elementos.get(i);
                // Verificar si el elemento es del tipo que se busca (Barco o Camion)
                if (this.tipoElemento(e1,element)) {
                    elementos.remove(i);  // Remover el elemento de la lista
                    return e1;  // Retornar el elemento encontrado
                }
            }
        }
        return null;  // Si no se encontró ninguno o la lista está vacía
        
    }
    public boolean tipoElemento(Elementos e1, Class<?> tipo) {
        return tipo.isInstance(e1);
    }
    @Override
    public double getRecurso() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRecurso'");
    }
    @Override
    public String ejecutar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ejecutar'");
    }
    public LocalDate getFecha() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFecha'");
    }

}
