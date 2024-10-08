package sitioWeb1;

public class Main {
    public static void main(String[] args) {
        Noticia n1 = new Noticia("Futbol", "aaa", "aaa", "kiliam", "www");
        n1.addPalabra("partido");
        Noticia n2 = new Noticia("Futbol", "aaa", "aaa", "kiliam", "www");
        Noticia n3 = new Noticia("necro", "aaa", "aaa", "kiliam", "www");

        Categoria deporte = new Categoria("depor", "png");
        deporte.addElemento(n1);
        deporte.addElemento(n2);

        Categoria necrologicas = new Categoria("necro", "png");
        necrologicas.addNoticia(n3);


        /*
         * public class Main {
    public static void main(String[] args) {
        // Crear categoría y secciones
        Categoria deportes = new Categoria("Deportes", "imagen_deportes.jpg");
        Seccion futbol = new Seccion("Fútbol", "imagen_futbol.jpg");
        Seccion basquet = new Seccion("Básquet", "imagen_basquet.jpg");

        // Crear noticias
        Noticia noticia1 = new Noticia("Victoria del equipo local", "El equipo local ganó 3-1.", "Juan Pérez", "link1");
        Noticia noticia2 = new Noticia("Partido emocionante", "Un partido emocionante que terminó 2-2.", "Pedro López", "link2");
        Noticia noticia3 = new Noticia("Último momento", "Actualización sobre el torneo.", "Juan Pérez", "link3");

        // Agregar noticias a las secciones
        futbol.agregarNoticia(noticia1);
        futbol.agregarNoticia(noticia2);
        basquet.agregarNoticia(noticia3);

        // Agregar secciones a la categoría
        deportes.agregarElemento(futbol);
        deportes.agregarElemento(basquet);

        // Condiciones para búsqueda
        Condicion condicionTextoMayor200 = new CondTextoMayor(200);
        Condicion condicionAutorJuan = new CondAutor("Juan Pérez");
        Condicion condicionTituloUltimoMomento = new CondTituloExacto("Último momento");

        // Buscar noticias según las condiciones
        List<Noticia> noticiasTextoMayor200 = deportes.buscar(condicionTextoMayor200);
        List<Noticia> noticiasAutorJuan = deportes.buscar(condicionAutorJuan);
        List<Noticia> noticiasTituloUltimoMomento = deportes.buscar(condicionTituloUltimoMomento);

        // Mostrar resultados
        System.out.println("Noticias con texto mayor a 200 caracteres: " + noticiasTextoMayor200.size());
        System.out.println("Noticias del autor 'Juan Pérez': " + noticiasAutorJuan.size());
        System.out.println("Noticias con el título 'Último momento': " + noticiasTituloUltimoMomento.size());
    }
}

         */
    }   
}
