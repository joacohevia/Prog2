package Tp5.GastoPublico;

public class Main {
    public static void main(String[] args) {
        //casteo
        Ciudad tandil = new Ciudad("Tandil");

        Contribuyente con1 = new Contribuyente("mengano", 10, 1000);
        Contribuyente con2 = new Contribuyente("mengano", 10, 1000);

        
        ContriComer conComer = new ContriComer("angano_Comerciante", 20, 1000, 100, 5);
        ContriProg conProg = new ContriProg("langano_Prog", 30, 1000, 100, 5);

        tandil.addContribuyentes(con1);
        tandil.addContribuyentes(con2);
        tandil.addContribuyentes(conComer);
        tandil.addContribuyentes(conProg);

        System.out.println(conComer);
        System.out.println(conProg);
    }
}
