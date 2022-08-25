public class Kart {

    String nome;
    // Agregacao, colocando o ponteiro
    Piloto pilot;
    //Composicao, objeto inteiro
    Motor mot = new Motor(); // foi criado dentro do todo , precisa ser criado dentro de uma classe
    void pular(){
        System.out.println("O " + nome + " deu um pulo");
    }

    void soltarTurbo(){
        System.out.println("O " + nome + " soltou um turbo");
    }

    void fazerDrift(){
        System.out.println("O " + nome + " fez um Drift");
    }


}