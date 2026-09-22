public abstract class FormadePagamento {
    private String titular;

    public FormadePagamento(String titular){
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public abstract void processarPagamento(double valor);

}
