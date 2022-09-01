import java.util.Date;

public class Robo
{
    static long serialNumberGenerator;
    private long serialNumber;
    private Date dataCriacao;

    Processador processador;
    Corpo corpo;



    public Robo(long serialNumber, Date dataCriacao, String marca, float frqrobot , String cor, String tipo) {
        this.serialNumber = serialNumber;
        this.dataCriacao = dataCriacao;

        this.processador=new Processador(marca,frqrobot);
        this.corpo = new Corpo(tipo, cor);
    }

    public Robo(boolean temProcessador)
    {
        if(temProcessador=true)
        {
            System.out.println("Marca do Processador :" +this.processador);
        }
    }

    public void mostraConfigRobo()
    {
        System.out.println("Serial Number do robo: " +this.serialNumber);
        System.out.println("Data de Criacao do robo: "+this.dataCriacao);
        System.out.println("Tipo do corpo do robo: " + this.corpo.);
    }
}
