import java.util.UUID;

public abstract class FormaPagamento {
    private final String idTransacao;
    private final double valor;
    private boolean aprovado;

    public FormaPagamento(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do pagamento deve ser maior que zero.");
        }
        this.idTransacao = UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        this.valor = valor;
        this.aprovado = false;
    }

    public abstract boolean processar();
    
    public String getIdTransacao() {
        return idTransacao;
    }

    public double getValor() {
        return valor;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    protected void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}