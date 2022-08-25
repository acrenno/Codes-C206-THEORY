public class ClassePrincipal {
    public static void main(String[] args) {
        //variavel de referencia
        Funcionario func1;
        Funcionario func2;
        // Instancias dos objetos
        func1 = new Funcionario();
        func2 = new Funcionario(" fulano", 23, "123434321", 560);
        //setando atributos dos funcionarios
        func1.nome = "Joao";
        func1.idade =21;
        func1.salario = 900;
        func1.cpf = "123.456.789-00";
        //executando comportamentos do funcionario
        func1.mostraInfo();
        func1.tirarFerias("janeiro");
        System.out.println(func1.salarioAnual(false));
        func2.mostraInfo();
    }
}
}
