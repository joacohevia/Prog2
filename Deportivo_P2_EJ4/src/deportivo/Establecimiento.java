package deportivo;

import java.util.ArrayList;

public class Establecimiento {
	private ArrayList <Usuario> usuarios;
	
	public void buscarUsuario() {
		for(Usuario usuari : usuarios) {
			if(usuari.verficarSocio()) {
				usuari.setEsSocio(true);
			}else {
				usuari.setEsSocio(false);
			}
		}
	}
	
	
	public void agregarUsuario(Usuario usuari) {
		this.usuarios.add(usuari);
	}
	
	public int obtenerNum() {
		int num = usuarios.size();
		return num;
	}
}
