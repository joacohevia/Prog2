public class Encuestado extends Persona {

    private int dni;

    public Encuestado(int dni , String nombre){
        super(nombre);
        this.dni=dni;

    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public boolean equals(Object o){
        try{
            Encuestado encuestado= (Encuestado)o;
            if (encuestado.getDni()==this.getDni()){
                return true;
            }else{ return false;}
        }
        catch (Exception e){
            return false;
        }
    }

    public void responderEncuesta(Encuesta e1){
        e1.responderEncuesta();
    }
    
    
}
