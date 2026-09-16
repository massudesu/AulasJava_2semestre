

import static java.lang.IO.*;

void main() {


        println("Cadastro Gerente");
        String nome_gerente = readln("Digite o nome do gerente: ");
        String cpf_gerente = readln("Digite o cpf do gerente: ");
        float salario_gerente = Float.parseFloat(readln("Digite o salário do gerente: "));

        println("Cadastro Desenvolvedor");
        String nome_dev = readln("Digite o nome do desenvolvedor: ");
        String cpf_dev = readln("Digite o cpf do desenvolvedor: ");
        float salario_dev = Float.parseFloat(readln("Digite o salário do desenvolvedor: "));

        println("Cadastro Vendedos");
        String nome_vendedor = readln("Digite o nome do vendedor: ");
        String cpf_vendedor = readln("Digite o cpf do vendedor: ");
        float salario_vendedor = Float.parseFloat(readln("Digite o salário do vendedor: "));
        float totalVendido = Float.parseFloat(readln("Digite o valor total de vendas: "));


        try {
                Funcionario gerente = new Gerente(nome_gerente, cpf_gerente, salario_gerente);
                Funcionario dev = new Desenvolvedor(nome_dev, cpf_dev, salario_dev);
                Funcionario vendedor = new Vendedor(nome_vendedor, cpf_vendedor, salario_vendedor, totalVendido);

                println("==EMISSAO DE HOLERITE");
                gerente.exibirHolerite();
                dev.exibirHolerite();
                vendedor.exibirHolerite();
        } catch (IllegalArgumentException e) {
                println("[ERRO DE VALIDAÇÃO]: " + e.getMessage());
        }
}

private String lerTextoValido(String mensagem) {
        while (true) {
                String entrada = readln(mensagem);
                if (entrada != null && !entrada.isBlank()) {
                        return entrada.trim();
                }
                println("Entrada invalida o campo nao pode ficar em branco.");
        }
}

private double LerDoubleValido(String mensagem) {
        while (true) {
                try {
                        String entrada = readln(mensagem);
                        double valor = Double.parseDouble(entrada.replace(",", "."));
                        if (valor <= 0) {
                                println("Entrada invalida! o valr deve ser maior que 0");
                                continue;
                        }
                        return valor;
                } catch (NumberFormatException e) {
                        println("Formato invalido! Digite apenas numeros validos (Ex: 3500.50)");
                }
        }
}

//import static java.lang.IO.*;
//
//public class Main {
//        void main() {
//                println("========================================");
//                println(" SISTEMA DE CADASTRO DE FUNCIONÁRIOS ");
//                println("========================================");
//
//// 1. Leitura dos dados do Gerente
//                println("\n--- Cadastro: Gerente ---");
//                String nomeGerente = lerTextoValido("Digite o nome do gerente: ");
//                String cpfGerente = lerTextoValido("Digite o CPF do gerente: ");
//                double salarioGerente = lerDoubleValido("Digite o salário do gerente (R$): ");
//
//// 2. Leitura dos dados do Desenvolvedor
//                println("\n--- Cadastro: Desenvolvedor ---");
//                String nomeDev = lerTextoValido("Digite o nome do desenvolvedor: ");
//                String cpfDev = lerTextoValido("Digite o CPF do desenvolvedor: ");
//                double salarioDev = lerDoubleValido("Digite o salário do desenvolvedor (R$): ");
//
//// 3. Leitura dos dados do Vendedor
//                println("\n--- Cadastro: Vendedor ---");
//                String nomeVendedor = lerTextoValido("Digite o nome do vendedor: ");
//                String cpfVendedor = lerTextoValido("Digite o CPF do vendedor: ");
//                double salarioVendedor = lerDoubleValido("Digite o salário do vendedor (R$): ");
//                double totalVendido = lerDoubleValido("Digite o total de vendas (R$): ");
//
//// Instancia com captura de possíveis exceções de regra de negócio
//                try {
//                        Funcionario gerente = new Gerente(nomeGerente, cpfGerente, salarioGerente);
//                        Funcionario dev = new Desenvolvedor(nomeDev, cpfDev, salarioDev);
//                        Funcionario vendedor = new Vendedor(nomeVendedor, cpfVendedor, salarioVendedor, totalVendido);
//
//// Exibição de todos os holerites
//                        println("\n=== EMISSÃO DE HOLERITES ===\n");
//                        gerente.exibirHolerite();
//                        dev.exibirHolerite();
//                        vendedor.exibirHolerite();
//
//                } catch (IllegalArgumentException e) {
//                        println("\n[ERRO DE VALIDAÇÃO]: " + e.getMessage());
//                }
//        }
//
//// --- Métodos Auxiliares para Validação de Entrada de Usuário (UX/Main) ---
//
//        private String lerTextoValido(String mensagem) {
//                while (true) {
//                        String entrada = readln(mensagem);
//                        if (entrada != null && !entrada.isBlank()) {
//                                return entrada.trim();
//                        }
//                        println(" -> Entrada inválida! O campo não pode ficar em branco.");
//                }
//        }
//
//        private double lerDoubleValido(String mensagem) {
//                while (true) {
//                        try {
//                                String entrada = readln(mensagem);
//// Substitui vírgula por ponto para suportar ambos os formatos
//                                double valor = Double.parseDouble(entrada.replace(",", "."));
//
//                                if (valor <= 0) {
//                                        println(" -> Entrada inválida! O valor deve ser maior que zero.");
//                                        continue;
//                                }
//                                return valor;
//                        } catch (NumberFormatException e) {
//                                println(" -> Formato inválido! Digite apenas números válidos (Ex: 3500.50).");
//                        }
//                }
//        }
//}