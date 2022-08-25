public class ClassePrincipal {

    public static void main(String[] args) {

        Trabalhador t1 = new Trabalhador();
        t1.nome = "Gian";
        t1.profissao = "Estagiario";
        t1.salario = 1800;
        t1.rg = "131.842.1016-43";
        t1.dataNascimento = "07/08";
        Trabalhador t2 = new Trabalhador();
        t2.nome = "diva";
        t2.profissao = "analista";
        t2.salario = 3600;
        t2.rg = "123.456.789-00";
        t2.dataNascimento = "10/02";
        //referencia do segundo trabalhador recebe a referencia do primeiro trabalhador
        t2=t1;
        //logo o garbage collector vai pegar o lixo que o t2 gerou
        System.out.println("Segue os novos salarios dos trabalhadores:");
        t1.recebeAumento(900);
        t2.recebeAumento(345);
        System.out.println(" ");
        System.out.println("Qual será o salario anual desses trabalhadores?: Trabalhador 1 ganha " + t1.calculaGanhoAnual() + " e trabalhador 2 ganha " +t2.calculaGanhoAnual());
        System.out.println(" ");
        System.out.println("Segue informacoes dos trabalhadores:");
        t1.mostraInfosFuncionarios();
        t2.mostraInfosFuncionarios();
    }
}