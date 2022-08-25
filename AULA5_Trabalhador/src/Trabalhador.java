public class Trabalhador {

    //ATRIBUTOS
    String nome;
    String profissao;
    float salario;
    String rg;
    String dataNascimento;
    //metodos
    void recebeAumento(float valor){

        System.out.println("O(A) trabalhador recebeu " +valor+ " de aumento ");
    }

    float calculaGanhoAnual(){

        return salario * 13;
    }

    void mostraInfosFuncionarios(){

        System.out.println("Nome do funcionario: " +nome);
        System.out.println("Profissao do funcionario: " +profissao);
        System.out.println("Salario mensal do funcionario: " + salario);
        System.out.println("RG do funcionario: " + rg);
        System.out.println("Data de nascimento do funcionario: " + dataNascimento);
    }


}