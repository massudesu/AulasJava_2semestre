void main() {
    Checkout checkout = new Checkout();

    IO.println("=== COMPRA SEGURA ===");

    // pix
    FormaPagamento pixSucesso = new PagamentoPix(150.00, 500.00);
    checkout.processarPagamento(pixSucesso);

    // cartao credito
    FormaPagamento cartaoFalha = new PagamentoCartaoCredito(1200.00, 800.00);
    checkout.processarPagamento(cartaoFalha);

    // boleto
    FormaPagamento boleto = new PagamentoBoleto(89.90, 3);
    checkout.processarPagamento(boleto);

    // valor negativo
    try {
        FormaPagamento invalido = new PagamentoPix(-50.00, 100.00);
    } catch (IllegalArgumentException e) {
        IO.println(e.getMessage());
    }
}