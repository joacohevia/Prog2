package Parcialito4;

public class Material {
    String nombre;


    public Material(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        return this.getNombre().equals(((Material)obj).getNombre());
    }

    @Override
    public String toString() {
        return "Material{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
