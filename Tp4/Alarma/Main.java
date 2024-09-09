package Tp4.Alarma;

public class Main {
    public static void main(String[] args) {
        /* Alarma alarma = new Alarma(false,false,false);

        alarma.comprobar();
        alarma.setMovimiento(true);
        alarma.comprobar();
        System.out.println("-------------------------------------");
        //herencia
        Alarma alarmaL = new AlarmaLum(false, false, false);
        alarmaL.comprobar();
        alarmaL.setPuertas(true);
        alarmaL.comprobar();
        */

        Alarma alarmaZona = new Alarma();

        Sensor s1 = new Sensor("Living-Comedor");
        Sensor s2 = new Sensor("Baño");
        Sensor s3 = new Sensor("Cochera");
        alarmaZona.agregarSensor(s1,s2,s3);
        s2.setSies(true);
        s3.setSies(false);
        s1.setSies(true);
        alarmaZona.comprobar();
        
        System.out.println("-----------------------------------------");
        Alarma alarmaSen = new AlarmaLum();
        alarmaSen.agregarSensor(s1,s2);
        alarmaSen.comprobar();
    }
}
