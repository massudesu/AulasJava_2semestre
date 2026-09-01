import static java.lang.IO.*;

void main() {

    println("===== COFRINHO =====");

    String nome = readln("Digite seu nome: ");
    double meta = Double.parseDouble(readln("Digite sua meta de economia: "));

    Cofrinho cofrinho = new Cofrinho(nome, meta);

    println("\nCofrinho de: " + cofrinho.getNome());
    println("Meta: R$ " + cofrinho.getMeta());
    println("Saldo: R$ " + cofrinho.getSaldo());
    println("Progresso: " + cofrinho.getProgresso() + "%");
    println("Status: " + cofrinho.getStatus());

    println("\n--- Adicionando dinheiro ---");

    double valor = Double.parseDouble(readln("Quanto deseja adicionar? "));
    cofrinho.adicionarDinheiro(valor);

    println("Saldo: R$ " + cofrinho.getSaldo());
    println("Progresso: " + cofrinho.getProgresso() + "%");
    println("Status: " + cofrinho.getStatus());

    println("\n--- Retirando dinheiro ---");

    valor = Double.parseDouble(readln("Quanto deseja retirar? "));
    cofrinho.retirarDinheiro(valor);

    println("Saldo: R$ " + cofrinho.getSaldo());
    println("Progresso: " + cofrinho.getProgresso() + "%");
    println("Status: " + cofrinho.getStatus());
}