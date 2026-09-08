public class PagamentoPix extends FormaPagamento {
    private double saldoConta;

    public PagamentoPix(double valor, double saldoConta) {
        super(valor);
        this.saldoConta = saldoConta;
    }

    @Override
    public boolean processar() {
        if (saldoConta >= getValor()) {
            saldoConta -= getValor();
            setAprovado(true);
            IO.println("[PIX] Pagamento aprovado! Saldo restante: R$ " + String.format("%.2f", saldoConta));
            return true;
        }
        setAprovado(false);
        IO.println("[PIX] Pagamento recusado. Saldo insuficiente.");
        return false;
    }

    public double getSaldoConta() {
        return saldoConta;
    }
}