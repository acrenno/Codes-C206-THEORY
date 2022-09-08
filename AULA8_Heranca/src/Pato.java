public class Pato extends Animal{

    private float tamanhoBico;

    @Override
    public void fazBarulho() {
        System.out.println("Barulho de pato");
    }

    public void setTamanhoBico(float tamanhoBico) {
        this.tamanhoBico = tamanhoBico;
    }
}
