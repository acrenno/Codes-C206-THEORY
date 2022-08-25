public class ClassePrincipal {
    public static void main(String[] args) {
        //EXERCICIO MARIO KART
        //criando os pilotos
        Piloto piloto1 = new Piloto();
        piloto1.nomePiloto = "Mario";
        piloto1.vilao = false;
        Piloto piloto2 = new Piloto();
        piloto2.nomePiloto = "Wario";
        piloto2.vilao = true;
        // Criando os karts
        Kart k1 = new Kart();
        //Preenchendo os dados do motor
        k1.nome = "fusca";
        k1.mot.cilindradas = "50cc";
        k1.mot.velocidadeMaxima = 134;
        //colocando o piloto dentro do kart
        k1.pilot = piloto1;
        Kart k2 = new Kart();
        k2.nome = "formula 1";
        k2.mot.cilindradas = "100cc";
        k2.mot.velocidadeMaxima = 112;
        //colocando o piloto dentro do kart
        k2.pilot = piloto2;
        //chamando metodos dos karts
        k1.fazerDrift();
        k1.pilot.soltaSuperPoder();
        //chamando dados do motor de um kart
        System.out.println("piloto do kart 2"+k2.nome);
        System.out.println(k2.pilot.nomePiloto);
        System.out.println("Velocidade" +k2.mot.velocidadeMaxima);
        System.out.println(k2.mot.cilindradas);
    }
}
