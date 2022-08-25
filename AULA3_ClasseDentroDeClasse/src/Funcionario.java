public class Funcionario {

    String nome;// variavel para o nome
    int idade; //variavel para idade
    String cpf;//variavel para cpf
    double salario;//variavel para salario
    void mostraInfo(){
        System.out.println("Nome: " +this.nome);
        System.out.println("Idade: " +this.idade);
        System.out.println("Salario: " +this.salario);
        System.out.println("cpf: " +this.cpf);
    }
    void tirarFerias(String mes){
        System.out.println(" o funcionario " + this.nome + " vai tirar ferias no mes " + mes);
    }

    double salarioAnual(){
        return this.salario*12;
    }

    //toda vez que criar um funcionario novo
    public Funcionario(String nome, int idade, String cpf, double salario){
        this.nome = nome;
        this.idade = idade;
        this.cpf=cpf;
        this.salario=salario;
    }

    double salarioAnual(boolean teste){
        if(teste)
            return this.salario*13;
        else return this.salario*12;
    }
}