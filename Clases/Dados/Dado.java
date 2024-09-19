
public class Dado {
   int caras;
   
   public Dado(int c) {
	   this.setCaras(c);
   }
   public Dado() {
	   this(6);
   }
   public void setCaras(int x) {
	   if (x>0) {
		   caras = x;
	   } else {
		   if (x<0) {
			   caras = -x;
		   } else {
			   caras = 2;
		   }
	   }
   }
   
   public int getCaras() {
	   return caras;
	   
   }
   
   public int tirar() {
	   return (int)((Math.random()*this.caras)+1);
   }
   
   public boolean equals(Object o1) {
	   try {
		   Dado d1 = (Dado)o1;
		   return d1.getCaras() == caras;
	   } catch(Exception e) {
		   //e.printStackTrace();
		   return false;
	   }
	   
   }
   
   public String toString() {
	   return "DADO DE "+caras+" CARAS";
   }
}
