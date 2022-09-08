import java.util.Date;

public class Ingresso {

    //ATRIBUTOS
    private static long numberGenerator;
    private long numero;
    protected float valorIngresso;
    protected static float taxaCartao;
    protected Date dataHoraCompra;


    //METODOS
    Ingresso()
    {
        //GERANDO VALORES DE INGRESSO
        numberGenerator++;
        numero = numberGenerator;

        //TERMINANDO DE DECLARAR DATE
        dataHoraCompra = new Date();
    }
    public float calculaTotalIngresso()
    {
     return valorIngresso+taxaCartao;
    }

    public void mostraInfos()
    {
        System.out.println("Numero do ingresso: " + numero);
        System.out.println("Valor do ingresso: " +calculaTotalIngresso());
        System.out.println("Data da compra: " +dataHoraCompra);
    }

}
