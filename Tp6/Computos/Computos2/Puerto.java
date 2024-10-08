package Computos2;

public class Puerto {
   String nombre;
   private CBarco barco;
   private Elementos elemen;

   public Puerto(String nombre){
      this.nombre=nombre;
      elemen = new Elementos();
   }
  
   public void addElementos(Elementos element){
      elemen.addElementos(element);
  }
  public void cargarBarco(){
   
  }
}
