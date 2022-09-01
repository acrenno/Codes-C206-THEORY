public class MainClass {
    //new= aloca um novo objeto dentro da memoria RAM
    /*
    CONSTRUTOR = pseudometodo
    +nao retorna valores
    +so executa uma unica vez, no momento em que criamos o NEW (objeto)
    +tem o mesmo nome da classe
     */

    // ATRIBUTO DE CLASSE : compartilhado entre os objetos da mesma classe

    public static void main(String[] args)
    {
        Conta c1 = new Conta();
        Conta c2 = new Conta(2123,2300,"Anna");

        System.out.println(Conta.totalDeContas);

    }

}
