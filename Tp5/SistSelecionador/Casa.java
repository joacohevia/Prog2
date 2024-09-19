package Tp5.SistSelecionador;
import java.util.ArrayList;
public class Casa {
    private ArrayList <Casa> casaEnemiga;
    private ArrayList <Alumno> alumnos;
    private ArrayList <String> habilidadesAceptar;
    private String nombre;
    private int cantidad;
    private boolean familiar;

    
    public Casa(String nombre,ArrayList<String> habilidadesAceptar,int cantidad,boolean fam) {
        this.casaEnemiga = new ArrayList<>();
        this.alumnos = new ArrayList<>();
        this.habilidadesAceptar = habilidadesAceptar;
        this.cantidad = cantidad;
        this.familiar = fam;
        this.nombre = nombre;
        
    }
    public boolean capacidadVal(){
        return alumnos.size() <= cantidad;
    }
    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    

    public ArrayList<Casa> getCasaEnemiga() {
        return casaEnemiga;
    }
    public void setCasaEnemiga(ArrayList<Casa> casaEnemiga) {
        this.casaEnemiga = casaEnemiga;
    }
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    public ArrayList<String> getHabilidadesAceptar() {
        return habilidadesAceptar;
    }
    public void setHabilidadesAceptar(ArrayList<String> habilidadesAceptar) {
        this.habilidadesAceptar = habilidadesAceptar;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isFamiliar() {
        return familiar;
    }


    public void setFamiliar(boolean familiar) {
        this.familiar = familiar;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
