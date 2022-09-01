public class Conta
{
    //ATRIBUTOS
    private int numero;
    private float saldo;
    private String proprietario;

    //ATRIBUTO PERTENCE À CLASSE
    //CLASSE PODE ACESSAR/MANIPULAR
    //TODOS OS OBJETOS TESTAM
    static int totalDeContas;

    //CRIANDO UM CONSTRUTOR

    public Conta()
    {
        System.out.println("CONSTRUTOR SIMPLES SENDO CRIADO");
        totalDeContas++;
    }

    public Conta(int numero, float saldo, String proprietario) {
        this.numero = numero;
        this.saldo = saldo;
        this.proprietario = proprietario;
        System.out.println("Voce criou uma nova conta!");
        totalDeContas++;

    }

}
