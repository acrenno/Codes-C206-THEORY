public class Kids extends VIP{
    private String docResponsavel;

    @Override
    public void mostraInfos() {
        super.mostraInfos();
        System.out.println("Documento do Responsavel: " +docResponsavel);
    }

    public String getDocResponsavel() {
        return docResponsavel;
    }

    public void setDocResponsavel(String docResponsavel) {
        this.docResponsavel = docResponsavel;
    }
}
