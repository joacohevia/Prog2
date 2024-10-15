package EjercicioNavidad;

import java.util.ArrayList;
public class Carta {

	private String remitente;
	private ArrayList<String> regalos;
	
	public Carta(String remitente){
		this.remitente = remitente;
		this.regalos = new ArrayList<>();
	}
	
	
	public void addRegalo(String regalo){
		this.regalos.add(regalo);
	}
	
	public ArrayList<String> getListaRegalos(){
		return new ArrayList<>(regalos);
	}
	
	public void vaciarLista(){
		for(int i = 0; i < regalos.size(); i++){
			this.regalos.remove(i);
		}
	}
	

	public String getRemitente() {
		return remitente;
	}

	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}
	
	
	
}
