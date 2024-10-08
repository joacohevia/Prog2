package SistElectoral;

public class Votante {
    private String dni;

    public Votante(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Votante [dni=" + dni + "]";
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    
}
