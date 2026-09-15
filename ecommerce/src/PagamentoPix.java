import static java.lang.IO.*;
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
            println("[PIX] Pagamento aprovado! Saldo restante: R$ " + String.format("%.2f", saldoConta));
            return true;
        }
        setAprovado(false);
        println("[PIX] Pagamento recusado.");
        return false;
    }

    public double getSaldoConta() {
        return saldoConta;
    }
}