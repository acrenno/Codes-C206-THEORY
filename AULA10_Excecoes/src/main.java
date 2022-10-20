import java.io.FileNotFoundException;

public class main {

    public static void main(String[] args) {

        System.out.println("Inicio do metodo main");
        metodo1();
        System.out.println("Fim do metodo main");

    }


    public static void metodo1() {

        System.out.println("INICIO DO METODO 1");
        metodo2();
        System.out.println("FIM DO METODO 1");

        try {
            new java.io.FileInputStream("arquivo.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void metodo2() {
        System.out.println("INICIO DO METODO 2");
        int[] array = new int[10];

        try {
            for (int i = 0; i < 15; i++) {
                array[i] = i;
                System.out.println(i);

            }
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("opa, excecao!!!");
        }
        System.out.println("FIM DO METODO 2");
    }
}