public class MainClass {
    public static void main(String[] args) {


        //classe abstrata, uma classe muito generica, nao pode criar objetos da classe
        //exerce o poliformismo e heranca
        //nem toda classe mae é abstrata
        //abstract metod= criado na mae, e forcam as filhas a darem override

        Pizza[] p = new Pizza[10];

        Brasileira brasileira = new Brasileira();
        Pepperoni pepperoni = new Pepperoni();
        Supreme supreme = new Supreme();

        p[0] = brasileira;
        p[1] = pepperoni;
        p[2] = supreme;

        for (int i = 0; i < p.length; i++) {
            if (p[i] != null) {
                if (p[i] instanceof Brasileira) {
                    Brasileira b = (Brasileira) p[i];
                    b.mostraIngredientes();
                    System.out.print("O brinde da pizza brasileira é um ");
                    System.out.println(b.mostraBrinde());
                    System.out.println();
                }

                if (p[i] instanceof Pepperoni) {
                    Pepperoni pe= (Pepperoni) p[i];
                    pe.mostraIngredientes();
                    System.out.print("O brinde da pizza pepperoni é um ");
                    System.out.println(pe.mostraBrinde());
                    System.out.println();
                }

                if (p[i] instanceof Supreme) {
                    Supreme s = (Supreme) p[i];
                    s.mostraIngredientes();
                    System.out.print("O brinde da pizza supreme é um ");
                    System.out.println(s.mostraBrinde());
                    System.out.println();
                }
            }


        }
    }
}