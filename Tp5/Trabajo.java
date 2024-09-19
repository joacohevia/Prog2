import java.util.ArrayList;

public class Trabajo {
    private ArrayList<String> temas;
    private boolean esPoster;
    private Evaluador evaludorAsignado;
    private String autor;
    private String titulo;

    public Trabajo(String titulo, String autor, boolean esPoster) {
        setPoster(esPoster);
        setAutor(autor);
        setTitulo(titulo);
        this.temas = new ArrayList<String>();
    }

    public boolean esPoster() {
        return esPoster;
    }

    public void setPoster(boolean esPoster) {
        this.esPoster = esPoster;
    }

    public Evaluador getEvaludorAsignado() {
        return evaludorAsignado;
    }

    public void setEvaludorAsignado(Evaluador evaludorAsignado) {
        this.evaludorAsignado = evaludorAsignado;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void agregarTema(String tema) {
        String nuevoIngreso = tema.toLowerCase();
        if (!this.temas.contains(nuevoIngreso)) {
            this.temas.add(nuevoIngreso);
        }
    }

    public ArrayList<String> getTemas() {
        return new ArrayList<String>(temas);
    }

    // equals
    public boolean equals(Object obj) {
        try {
            Trabajo nuevo = (Trabajo) obj;
            return this.titulo.equals(nuevo.getTitulo()) && this.autor.equals(nuevo.getAutor())
                   /* && this.temas.equals(nuevo.getTemas())*/;
        } catch (Exception e) {
            return false;
        }
    }

}
