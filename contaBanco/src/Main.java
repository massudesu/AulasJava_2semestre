import static java.lang.IO.*;

void main() {

    ContaBancaria contaBancaria = new ContaBancaria();
    String nome = IO.readln("Qual é seu nome: ");
    contaBancaria.setTitular(nome);
    Float limite = Float.parseFloat(IO.readln("Quando você quer de limite(ATE R$1000, se passar NAO TERA LIMITE!!!!!): "));
    contaBancaria.setLimite(limite);
    while (true) {

        println("=========================================");
        println("Ola "+ contaBancaria.getTitular());
        println("O que quer fazer? ");
        println("1 Depositar");
        println("2 Sacar");
        println("3 Consultar Saldo");
        println("0 Sair");

        String opcao = readln();

        if (opcao.equals("0")) {
            println("Saindo");
            break;
        }

        switch (opcao) {
            case "1":
                float valorDeposito = Float.parseFloat(readln("Quanto você quer depositar: "));
                contaBancaria.depositar(valorDeposito);
                println("Depósito realizado");
                println("Novo saldo: R$ " + contaBancaria.getSaldo());
                break;

            case "2":
                float valorSaque = Float.parseFloat(readln("Quanto você quer sacar: "));
                boolean sucesso = contaBancaria.sacar(valorSaque);
                if (sucesso) {
                    println("Saque realizado");
                } else {
                    println("Saldo ou limite insuficiente");
                }
                println("Saldo atual: R$ " + contaBancaria.getSaldo());
                break;

            case "3":
                println("Seu saldo atual é: R$ " + contaBancaria.getSaldo());

                println("Seu limite é de: R$ " + contaBancaria.getLimite());

                break;
        }
    }
}
