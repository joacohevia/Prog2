package ParSitioweb;

import java.util.ArrayList;

import ParSitioweb.CondicionesWeb.Condicion;

public class Video extends ElementoVideo{
    private Usuario usuario;
    private int duracion;
    private int cantVisualizacion;
    private int cantMg;
    private int cantNoMg;
    private int anio;
    private ArrayList <String> palClaves;
    
    public Video(String titulo, Usuario uu, int duracion, int cantVisualizacion, int cantMg, int cantNoMg, int anio) {
        super(titulo);
        this.usuario = uu;
        this.duracion = duracion;
        this.cantVisualizacion = cantVisualizacion;
        this.cantMg = cantMg;
        this.cantNoMg = cantNoMg;
        this.anio = anio;
        this.palClaves = new ArrayList<>();
    }

    public void addPal(String nuevo){
        if (!palClaves.contains(nuevo.toLowerCase())) {
            palClaves.add(nuevo.toLowerCase());
        }
    }
    @Override
    public ArrayList<String> getPalClaves() {
        //aca solo devuelvo la copia y se que no devuelvo repetidos porq
        //controlo q ni siquiera me los agreguen
        ArrayList <String> copia = new ArrayList<>();
        copia.addAll(palClaves);
        return copia;
    }
    @Override
    public int getCantidad() {
        return 1;
    }
    @Override
    public int getDuracion() {
        return duracion;
    }
    @Override
    public ArrayList<Video> buscar(Condicion cc) {
        ArrayList <Video> salida = new ArrayList<>();
        if (cc.cumple(this)) {
            salida.add(this);
        }
        return salida;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public int getCantVisualizacion() {
        return cantVisualizacion;
    }
    public void setCantVisualizacion(int cantVisualizacion) {
        this.cantVisualizacion = cantVisualizacion;
    }
    public int getCantMg() {
        return cantMg;
    }
    public void setCantMg(int cantMg) {
        this.cantMg = cantMg;
    }
    public int getCantNoMg() {
        return cantNoMg;
    }
    public void setCantNoMg(int cantNoMg) {
        this.cantNoMg = cantNoMg;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
}
