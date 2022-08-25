public class Classeprincipal {
    //classe != primitivo
    //classe é aquilo que tem caracteristicas e acoes.
    // classe é um tipo especial de dado
    //objetos se baseiam em classe, produzidos a partir de um modelo(classe)
    //objetos = mais especifico
    //quando da o new pessoa voce esta criando um objeto, porem nao esta apto a manipular o objeto, apenas apos voce criar o ponteiro
    public static void main(String[] args) {
        // Pessoa p1 = criando o ponteiro p1, para manipular as informacoes da pessoa 1
        // para se criar um objeto dentro da memoria usasse a palavra new
        //para acessar esse objeto, precisa criar um ponteiro para ele
        Pessoa p1 = new Pessoa();//criando pessoa1 "new"
        p1.nome = "Diego";
        p1.idade = 19;
        p1.cpf= "123.456.789-00";
        Pessoa p2 = new Pessoa();
        p2.nome = "Isaq";
        p2.idade = 19;
        p2.cpf= "1223.43.221.-3";
        Pessoa p3 = new Pessoa();
        p3.nome = "Maria Luiza";
        p3.idade = 20;
        p3.cpf= "122.23.4.299-0";
        p1.comer();
        p2.dormir();
        p3.tomarAgua();
    }


}
}
