void main() {
    Caixa caixa = new Caixa();

    FormadePagamento pix = new PagamentoPix("Ana Silva", "ana@gmail.com");
    FormadePagamento cartao = new PagamentoCartao("Carlos Silva", "12345678910");

    caixa.finalizarCompra(pix, 120.00);
    caixa.finalizarCompra(cartao, 350.00);
}