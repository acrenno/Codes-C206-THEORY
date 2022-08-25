public class Computador {
    public String marca;
    public float preco;
    MemoriaUSB memousb;
    SistemaOperacional so;
    HardwareBasico hb;
    boolean tem;


    public Computador(String marca, float preco, String nomesop, int tiposop, String nomehard, float capahard , boolean tem)
    {
        this.marca=marca;
        this.preco=preco;
        this.tem=tem;

        so=new SistemaOperacional(nomesop, tiposop);
        hb=new HardwareBasico(nomehard, capahard);
    }

    void mostraPCConfigs()
    {

        System.out.println("Marca do PC: " +this.marca);
        System.out.println("Preco do PC: "+this.preco);
        System.out.println("Sistema Operacional: " +this.so.nome);
        System.out.println("Tipo do Sistema Operacional: " +this.so.tipo);
        System.out.println("Hardware Basico: " +this.hb.nome);
        System.out.println("Capacidade do Hardware Basico: " +this.hb.capacidade);

       // if(addMemoriaUSB(MemoriaUSB)==false)
         //   System.out.println("O PC nao tem Memoria USB");
       // else
        //{
          //  System.out.println("Memoria USB: "+memousb.nome);
          //  System.out.println("Memoria USB: "+memousb.capacidade);
       //}

        System.out.println("================================");
    }

    void addMemoriaUSB(MemoriaUSB memoriaUSB)
    {
         if(this.tem==false){
             this.tem=true;
         }

         else
         this.tem=false;
    }


}
