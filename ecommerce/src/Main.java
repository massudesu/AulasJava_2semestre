import static java.lang.IO.*;

void main() {
    Checkout checkout = new Checkout();

    println("=== COMPRA SEGURA ===");

    // Pix
    FormaPagamento pixSucesso = new PagamentoPix(150.00, 500.00);
    checkout.processarPagamento(pixSucesso);

    // Cartão de Crédito
    FormaPagamento cartaoFalha = new PagamentoCartaoCredito(1200.00, 800.00);
    checkout.processarPagamento(cartaoFalha);

    // Boleto
    FormaPagamento boleto = new PagamentoBoleto(89.90, 3);
    checkout.processarPagamento(boleto);

    // Valor negativo
    try {
        FormaPagamento invalido = new PagamentoPix(-50.00, 100.00);
    } catch (IllegalArgumentException e) {
        println(e.getMessage());
    }
}