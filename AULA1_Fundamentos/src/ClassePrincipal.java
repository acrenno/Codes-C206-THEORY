import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
public class ClassePrincipal {


        //atalho psvm+enter
        public static void main(String[] args) {
            //comentario de uma unica linha
        /*
        comentario de multiplas
        linhas
         */
            /**
             *comentario especial do comentario java que cria documentos pro software
             */
        /*
        byte 8, short 32, int, long
        int,float,char -> PRIMITIVO -> guarda valores
        string, xxxx, xxxxx -> CLASSE ->guarda valores, usar de varias funcoes pré-prontas
         */
            //CRIANDO UM TIPO PRIMITIVO (primeira letra minuscula, colorido)
            int idade = 19;
            //CRIANDO UMA CLASSE (primeira letra maiuscula, cor branca)
            String nome = "Anna";
        /*
        //comando para escrever na tela "sout"
        //SYSTEM é uma classe
        System.out.println("Meu nome é:" +nome+ " e minha idade é " +idade);
        // ESCREVER TUDO MAIUSCULO
        System.out.println(nome.toUpperCase());
        //ESCREVER TUDO MINUSCULO
        System.out.println(nome.toLowerCase());
        //contar quantos caracteres tem no nome
        System.out.println(nome.length());
*/
            //casting de dados, mudar tipo de variavel
        /*
        long x - 10000;
        int i = (int) x;
        double d3 = 3.14;
        int i = (int) d3;
        i recebe o valor 3
         */
        /*
        // como entrar com dados
        //usando a classe scanner
        Scanner leitor = new Scanner(System.in);
        System.out.println("entre com o seu nome :");
        nome = leitor.nextLine(); // ler um nome. ler um inteiro leitor.nextIntorFLOAT();
        System.out.println("nome:" +nome); */
            int ano1=0;
            int ano2=0;
            int ano3=0;
            Scanner num = new Scanner(System.in);
            System.out.println("Entre com o numero de viloes aprendidos no ano 1:");
            ano1 = num.nextInt();
            System.out.println("Entre com o numero de viloes aprendidos no ano 2:");
            ano2 = num.nextInt();
            System.out.println("Entre com o numero de viloes aprendidos no ano 3:");
            ano3 = num.nextInt();
            int total=0;
            total=ano1+ano2+ano3;
            System.out.println("Total de viloes aprendidos:"+total);
        }
    }
