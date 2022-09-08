public class Camarote extends Ingresso{

    private String tamanhoCamiseta;

    @Override
    public void mostraInfos() {
        super.mostraInfos();
        System.out.println("Tamanho da camiseta: "+tamanhoCamiseta);
    }

    public String getTamanhoCamiseta() {
        return tamanhoCamiseta;
    }

    public void setTamanhoCamiseta(String tamanhoCamiseta) {
        this.tamanhoCamiseta = tamanhoCamiseta;
    }
}
