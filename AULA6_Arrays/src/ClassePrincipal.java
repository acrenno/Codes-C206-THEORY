public class ClassePrincipal {

    public static void main(String[] args) {
        //CARACTERISTICAS IMPORTANTES DE UM ARRAY
        //ARRAY = ARRANJO
        //arrays de primitivos guardam valores
        /*
        1. ARRAY É DE UM TAMANHO DEFINIDO
        2.GUARGA ELEMENTOS HOMOGENEOS, NAO CONSEGUE GUARDAR INT + FLOAT + STRING JUNTOS
        3. É DECLARADO COMO UM OBJETO (NEW)
         */
        /*
        //declarando o array de PRIMITIVOS GUARDA VALORES
        //duas partes
        //parte 1 = criando como se fosse um novo objeto ("new int[10]")
        //parte 2 = criando um ponteiro novo ("int[] numeros = ")
        int[] numeros = new int[10];
        //inserindo elementos no array
        numeros[0] = 15;
        numeros[8] = 20;
        //numeros.length = retorna o tamanho do vetor,array
        for (int i = 0; i < numeros.length ; i++) {
            System.out.println(numeros[i]);
        }
        outra alternativa criacao de array
        int n=100;
        int[] numeros = new int[n];
         */
        //IMPORTANTISSIMO CAI NA PROVA = quando criamos um array de alguma classe/objetos, na verdade temos um array de REFERENCIA
        // QUANDO O SEU OBJETO NAO TEM REFERENCIA, O GARBAJE COLLECTOR, MODULO DA JVM APAGA O OBJETO
        //DECLARANDO ARRAY DE OBJETOS
        Conta[] contas = new Conta[10];
        Conta c1 =new Conta();
        c1.dono = "Anna";
        c1.numero =21;
        Conta c2 =new Conta();
        c2.dono = "pedro";
        c2.numero = 31;
        //pedindo para cada posicao do array aponte para um objeto diferente
        contas[0] = c1;
        contas[1] = c2;
        contas[2] = new Conta(); //objeto novo sem referencia, dependente do array de objetos
        contas[2].numero = 99;
        for (Conta aux : contas) {
            //referencia diferente de null
            if(aux !=null);
            {
                System.out.println(aux.numero);
            }

        }


    }
}