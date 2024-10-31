package ParSitioweb;

public class Usuario {
    private String nombre;
    private int anioReg;
    private String email;
    public Usuario(String nombre, int anioReg, String email) {
        this.nombre = nombre;
        this.anioReg = anioReg;
        this.email = email;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getAnioReg() {
        return anioReg;
    }
    public void setAnioReg(int anioReg) {
        this.anioReg = anioReg;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    
}
