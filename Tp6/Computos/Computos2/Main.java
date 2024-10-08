package Computos2;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Puerto puerto1 = new Puerto("mardel");

        CBarco b1 = new CBarco(10);
        CCamion c1 = new CCamion(LocalDate.of(2024,3,3));
        puerto1.addElementos(b1);
        puerto1.addElementos(c1);
        puerto1.cargarBarco();
    }
}
