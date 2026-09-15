import static java.lang.IO.*;

public class PagamentoCartaoCredito extends FormaPagamento {
    private double limiteDisponivel;

    public PagamentoCartaoCredito(double valor, double limiteDisponivel) {
        super(valor);
        this.limiteDisponivel = limiteDisponivel;
    }

    @Override
    public boolean processar() {
        if (limiteDisponivel >= getValor()) {
            limiteDisponivel -= getValor();
            setAprovado(true);
            println("[CARTÃO] Pagamento aprovado! Limite restante: R$ " + String.format("%.2f", limiteDisponivel));
            return true;
        }
        setAprovado(false);
        println("[CARTÃO] Pagamento recusado. Limite indisponível.");
        return false;
    }

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }
}