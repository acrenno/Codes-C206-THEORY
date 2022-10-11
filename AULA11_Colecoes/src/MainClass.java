import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {


       // List<String> lista = new ArrayList<String>();
        //lista.add("Inatel");
        //lista.add("Anna");
        //lista.add("Joao");

        Conta c1 = new Conta("Joao", 1234, 20);
        Conta c2 = new Conta("Anna", 4567, 10);
        Conta c3 = new Conta("isa", 0000, 40);


        ArrayList<Conta> lista2 = new ArrayList<>();
        lista2.add(c1);
        lista2.add(c2);
        lista2.add(c3);

        System.out.println(lista2);

        Collections.sort(lista2);

        System.out.println(lista2);

    }
}
