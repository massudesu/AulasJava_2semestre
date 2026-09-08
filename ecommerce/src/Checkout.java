public class Checkout {
    public void processarPagamento(FormaPagamento pagamento) {
        IO.println("\n--------------------------------------------------");
        IO.println("Processando Transação ID: " + pagamento.getIdTransacao());
        IO.println("Valor: R$ " + String.format("%.2f", pagamento.getValor()));

        boolean sucesso = pagamento.processar();

        if (sucesso) {
            IO.println("Status Final: APROVADO");
        } else {
            IO.println("Status Final: REJEITADO");
        }
        IO.println("--------------------------------------------------");
    }
}