import java.time.LocalDate;
import static java.lang.IO.*;

public class PagamentoBoleto extends FormaPagamento {
    private final LocalDate dataVencimento;

    public PagamentoBoleto(double valor, int diasParaVencimento) {
        super(valor);
        this.dataVencimento = LocalDate.now().plusDays(diasParaVencimento);
    }

    @Override
    public boolean processar() {
        setAprovado(true);
        println("[BOLETO] Boleto gerado com sucesso!");
        println("        Vencimento: " + dataVencimento);
        println("        Aguardando compensação bancária.");
        return true;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }
}