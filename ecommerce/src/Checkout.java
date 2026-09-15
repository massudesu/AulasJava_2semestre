import static java.lang.IO.*;

public class Checkout {
    public void processarPagamento(FormaPagamento pagamento) {
        println("--------------------------------------------------");
        println("Processando Transação ID: " + pagamento.getIdTransacao());
        println("Valor: R$ " + String.format("%.2f", pagamento.getValor()));

        boolean sucesso = pagamento.processar();

        if (sucesso) {
            println("Status Final: APROVADO");
        } else {
            println("Status Final: REJEITADO");
        }
        println("--------------------------------------------------");
    }
}