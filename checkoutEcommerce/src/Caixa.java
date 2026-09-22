public class Caixa{
    public void finalizarCompra(FormadePagamento pagamento, double valor){
        System.out.println("Iniciando a transação...");
        pagamento.processarPagamento();
        System.out.println("Transação concluida com sucesso");

    }
}
