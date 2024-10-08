package Academia;

public class Main {
    public static void main(String[] args) {
        Pregunta mat = new Pregunta("¿Qué es 2 + 2?", 10, 5);
        Pregunta mat2 = new Pregunta("¿Qué es 2 + 90?", 6, 7);
        mat.addConceptos("mat");
        mat2.addConceptos("mat");

        Pregunta geo = new Pregunta("capital de arg", 10, 3);
        Pregunta geo2 = new Pregunta("capital de bra", 8, 6);
        geo.addConceptos("Geografia");
        geo2.addConceptos("Geografia");

        Secuencia sec = new Secuencia("Geografiaa");
        sec.addConceptos(geo);
        sec.addConceptos(geo2);

        Optativa opt = new Optativa("Matematica");
        opt.addConceptos(mat);
        opt.addConceptos(mat2);

        System.out.println(opt);
        System.out.println(sec);

    }
}
