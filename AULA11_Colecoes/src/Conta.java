public class Conta implements Comparable<Conta> {

    String dono;
    int numero;
    float saldo;

    public Conta(String dono, int numero, float saldo) {
        this.dono = dono;
        this.numero = numero;
        this.saldo = saldo;
    }


    @Override
    public int compareTo(Conta o) {
        if(numero<o.numero){
            return -1;
        }
        else if(numero>o.numero){
            return 1;
        }
        else{
            return 0;
        }
    }
}
