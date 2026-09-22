public class PagamentoPix extends FormadePagamento{
    private String chavePix;

    public PagamentoPix(String titular, String chavePix){
        super(titular);
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.printf("[PIX] Processando R$ %.2f para %s (Chave: %s)",valor, getTitular(), chavePix);
    }
}
