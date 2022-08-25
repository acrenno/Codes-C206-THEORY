public class Cliente
{
    public String nome;
    public long cpf;

    Computador[] computadors = new Computador[100];

    public Cliente(String nome, long cpf)
    {
        this.nome=nome;
        this.cpf=cpf;
    }

    public float calculaTotalCompra()
    {
        float soma=0;

        for (int i = 0; i < computadors.length; i++)
        {
            if(computadors[i]!=null)
                soma =soma+computadors[i].preco;
        }

        return soma;
    }
}
