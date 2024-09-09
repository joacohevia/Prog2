package Tp3.ContactoCelular;

import java.time.LocalDate;

public class Contacto {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private int telefono;
    private String direccion;
    private String email;
    private int edad;
    
    public Contacto(String nombre, String apellido, LocalDate fechaNacimiento, int telefono,int edad, String direccion,String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.edad = edad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public int getTelefono() {
        return telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getEmail() {
        return email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    

    
}    
