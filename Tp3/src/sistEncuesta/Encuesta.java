package sistEncuesta;

import java.util.ArrayList;
public class Encuesta {
	private ArrayList <String> preguntas;//doy preg y respuesta la guardo en arr respuesta
	private ArrayList <String> respuestas;//??
	private ArrayList <Usuario> usuarios;
	private Usuario usuario;
	private Empleado empleado;
	private int id;
	private int dni;
	private boolean respondido;
	
	public Encuesta(Empleado emple,Usuario usua, int id) {
		this.usuarios = new ArrayList<>();
		this.preguntas = new ArrayList<>();
		this.respuestas = new ArrayList<>();
		this.id=id;
		this.empleado=emple;
		this.usuario=usua;
		this.respondido=false;
		this.dni=usuario.getDni();
	}
	public boolean buscarDni(Usuario usuario) {
		for(int i=0; i<usuarios.size(); i++) {
			Usuario u = usuarios.get(i);
			if(usuario.getDni() == u.getDni()) {
				return true;
			}
		}
		return false;
	}
	 //como una encuesta se compone de preguntas. la encuesta es la que las agrega
    public void agregarPregunta(String p1){
        preguntas.add(p1);
    }//lo mismo con las respuestas
    public void agregarRespuesta(String r1){
        respuestas.add(r1);
    }
    public boolean encuestaRespondida(){
        if(preguntas.size()==respuestas.size()&&preguntas.size()>0) {
        	return true;
        }
        return false;
    }
    public boolean yaFueEncuestado(Usuario e1){
        if(e1.getDni()==this.getDni()){
            return true;
        }else{
        	return false;}
    }
    public void responderEncuesta(){
        for(int i=0;i<preguntas.size();i++){
        	String respuesta = "respondido";
        	respuestas.add(respuesta);  // Almacenar la respuesta en el array
        }
        this.setRespondido(true);
    }
    
    
    
	
	public ArrayList<String> getRespuestas() {
		return respuestas;
	}
	public void setRespuestas(ArrayList<String> respuestas) {
		this.respuestas = respuestas;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public void agregarUsuario(Usuario usu) {
		this.usuarios.add(usu);
	}
	public void agregarPreg(String	 preg) {
		this.preguntas.add(preg);
	}
	
	
	
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public ArrayList<String> getPreguntas() {
		return preguntas;
	}
	public void setPreguntas(ArrayList<String> preguntas) {
		this.preguntas = preguntas;
	}
	public boolean getRespondido() {
		return respondido;
	}
	public void setRespondido(boolean respondido) {
		this.respondido = respondido;
	}
	
	
	
}
