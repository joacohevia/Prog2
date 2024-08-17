package avion;

public class Juego1 {
	private int puntosJug1;
	private int puntosJug2;
	
	public Juego1() {
		puntosJug1=0;
		puntosJug2=0;
	}
	
	private int tirarDado() {
		
		return (int) ((Math.random()*6)+1);
	}
	
	public String ganador() {
		if(puntosJug1 > puntosJug2) {
			return "jug 1";
		}else if(puntosJug1 == puntosJug2) {
			return "jug 2";
		}
		else {
			return "empate";
		}
	}
	
	public int getPuntosJug1() {
		return puntosJug1;
	}

	public int getPuntosJug2() {
		return puntosJug2;
	}

	public String jugar() {
		int puntos1;
		int puntos2;
		for(int i=0; i<10; i++) {
			puntos1 = this.tirarDado() + tirarDado();
			puntos2= this.tirarDado() + tirarDado();
			if((puntos1 >=7)&& (puntos1>puntos2)) {
				puntosJug1++;
			}else if((puntos2 >=7)&&(puntos2 > puntos1)) {
				puntosJug2++;
			}
		}
		return this.ganador();
	}
}
