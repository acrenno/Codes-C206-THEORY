public class ClassePrincipal {

    public static void main(String[] args) {
        Computador comp1;
        Computador comp2;
        Computador comp3;

        MemoriaUSB memoriaUSB1 = new MemoriaUSB("Pen Drive" , 16);
        MemoriaUSB memoriaUSB2 = new MemoriaUSB("Pen Drive" , 32);
        MemoriaUSB memoriaUSB3 = new MemoriaUSB("HD Externo" , 1000);

        comp1=new Computador("Positivo", 1300, "Linux" , 32, "Pentium Core i3 1200Mhz" , 4 , false  );
        comp2=new Computador("Acer", 1800, "Windows" , 64, "Pentium Core i5 2260Mhz" , 8 , false);
        comp3=new Computador("Vaio", 2800, "Windows" , 64, "Pentium Core i7 3500Mhz" , 16 , false);

        comp1.addMemoriaUSB(memoriaUSB1);
        comp2.addMemoriaUSB(memoriaUSB2);
        comp3.addMemoriaUSB(memoriaUSB3);

        comp1.mostraPCConfigs();
        comp2.mostraPCConfigs();
        comp3.mostraPCConfigs();



    }
}
