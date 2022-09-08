public class VIP extends Ingresso{
    protected String tamanhoAbada;

    @Override
    public void mostraInfos() {
        super.mostraInfos();
        System.out.println("Tamanho do Abada: "+tamanhoAbada);
    }

    public String getTamanhoAbada() {
        return tamanhoAbada;
    }

    public void setTamanhoAbada(String tamanhoAbada) {
        this.tamanhoAbada = tamanhoAbada;
    }
}
