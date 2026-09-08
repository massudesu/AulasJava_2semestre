import java.time.LocalDate;

public class PagamentoBoleto extends FormaPagamento {
    private final LocalDate dataVencimento;

    public PagamentoBoleto(double valor, int diasParaVencimento) {
        super(valor);
        this.dataVencimento = LocalDate.now().plusDays(diasParaVencimento);
    }

    @Override
    public boolean processar() {
        setAprovado(true);
        IO.println("[BOLETO] Boleto gerado com sucesso!");
        IO.println("        Vencimento: " + dataVencimento);
        IO.println("        Aguardando compensação bancária.");
        return true;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }
}