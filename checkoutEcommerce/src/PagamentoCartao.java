public class PagamentoCartao extends FormadePagamento{
    private String numeroCartao;

    public PagamentoCartao(String titular, String numeroCartao){
        super(titular);
        this.numeroCartao = numeroCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    @Override
    public void processarPagamento(double valor) {
        String finalCartao = numeroCartao.substring(numeroCartao.length() -4);
        System.out.printf("[CARTAO] Cobrando R$ %.2f final %s de %s",valor, finalCartao, getTitular());
    }
}
