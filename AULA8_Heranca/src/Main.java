public class Main {

    public static void main(String[] args) {

        Coruja bixo1 = new Coruja();
        bixo1.nome = "Corjutia";
        bixo1.nPatas = 2;
        bixo1.cor = "Marrom";
        bixo1.setAlturaVoo(10);

        Leao bixo2 = new Leao();
        bixo2.nome = "Simba";
        bixo2.cor = "Bege";
        bixo2.setTamanhoJuba(2);

        Zoologico zoo = new Zoologico();
        zoo.setNome("Zoolandia");
        zoo.setEndereco("Rua Leao Coruja 300");

        zoo.getBixo()[0] =bixo1;
        zoo.getBixo()[1] =bixo2;

//Lendo um array de bichos
        for (int i = 0; i < zoo.getBixo().length; i++) {
            if(zoo.getBixo()[i] !=null){
                System.out.println(zoo.getBixo()[i].nome);
                System.out.println(zoo.getBixo()[i].cor);
                System.out.println(zoo.getBixo()[i].nPatas);
                //POLIMORFISMO
                if (zoo.getBixo()[i] instanceof Coruja){
                    Coruja coruja_aux = (Coruja) zoo.getBixo()[i];
                    System.out.println(coruja_aux.getAlturaVoo());
                }
                else if (zoo.getBixo()[i] instanceof Leao){
                    Leao leao_aux = (Leao) zoo.getBixo()[i];
                    System.out.println(leao_aux.getTamanhoJuba());
                }

            }

        }

    }
}