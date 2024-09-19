package Congreso8;

public class Main {
    public static void main(String[] args) {
        Congreso congre = new Congreso("CongresoTan");

        Evaluador evaluadorGeneral = new Evaluador("PEPITO", "general");
        evaluadorGeneral.addConocimiento("algoritmos");//lenguajes
        evaluadorGeneral.addConocimiento("redes"); 

        Evaluador evaluadorExperto = new Evaluador("PANCHITO", "experto");
        evaluadorExperto.addConocimiento("agentes");//visualizacion, redes

        Evaluador evaluadorExperto1 = new Evaluador("JUANITO", "experto");
        evaluadorExperto1.addConocimiento("resumenes");

        congre.addEvaluadores(evaluadorGeneral);
        congre.addEvaluadores(evaluadorExperto);
        congre.addEvaluadores(evaluadorExperto1);

        Trabajo trabajoArticulo = new Trabajo("articulo");
        trabajoArticulo.addTemasArticulo("algoritmos");
        trabajoArticulo.addTemasArticulo("redes");

        Trabajo trabajoPoster = new Trabajo("poster");
        trabajoPoster.addTemasPoster("agentes");

        Trabajo trabajoResumen = new Trabajo("resumen");
        trabajoResumen.addTemasResuemen("resumenes");

        congre.addTrabajos(trabajoArticulo);
        congre.addTrabajos(trabajoPoster);
        congre.addTrabajos(trabajoResumen);

        congre.asignarEvaluador();
        /*Lo que tiene que hacer el codigo es por cada trabajo asignar un evaluador por eso mismo recorre
         * el array trabajos y el array evaluadores en Congreso y busca si para cada uno de los trabajos los 
         * evaluadores tienen conocimiento, debo separar los temas de cada trabajo en array distintos porque
         * sino cuando agrego nuevos temas de los nuevos trabajos se suman al mismo y termino comparando 
         * un evaluador con dos temas conocidos a un trabajo con todos los temas
         */


    }
}
