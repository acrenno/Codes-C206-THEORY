public class CarrinhodeCompras {

    private String loginCliente;
    Ingresso[] ingressos = new Ingresso[100];

    public void addIngresso(Ingresso ingresso){
        for (int i = 0; i < ingressos.length ; i++)
        {
          if(ingressos[i]==null){
              ingresso = ingressos[i];
              System.out.println("Ingresso Comprado!");
              break;
          }
        }
    }

    public void mostraDetalhesCompras()
    {

        System.out.println(loginCliente);

        for (int i = 0; i < ingressos.length; i++)
        {
            if(ingressos[i]!=null){
           ingressos[i].mostraInfos();
           break;
            }
        }
    }
}
