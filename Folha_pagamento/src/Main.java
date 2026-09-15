import static java.lang.IO.*;

void main(){


//    while (true) {
        println("Cadastro Gerente");
//        if (nome_gerente.isEmpty() ||) {
        String nome_gerente = readln("Digite o nome do gerente: ");
//        }
        String cpf_gerente = readln("Digite o cpf do gerente: ");
        float salario_gerente = Float.parseFloat(readln("Digite o salário do gerente: "));

//        if(nome_gerente.isEmpty() || cpf_gerente.isEmpty()){
//
//        }

        String nome_dev = readln("Digite o nome do desenvolvedor: ");
        String cpf_dev = readln("Digite o cpf do desenvolvedor: ");
        float salario_dev = Float.parseFloat(readln("Digite o salário do desenvolvedor: "));

        String nome_vendedor = readln("Digite o nome do vendedor: ");
        String cpf_vendedor = readln("Digite o cpf do vendedor: ");
        float salario_vendedor = Float.parseFloat(readln("Digite o salário do vendedor: "));
        float totalVendido = Float.parseFloat(readln("Digite o valor total de vendas: "));

        Funcionario gerente = new Gerente(nome_gerente, cpf_gerente, salario_gerente);
        gerente.exibirHolerite();

        Funcionario dev = new Desenvolvedor(nome_dev, cpf_dev, salario_dev);
        dev.exibirHolerite();

        Funcionario vendedor = new Vendedor(nome_vendedor, cpf_vendedor, salario_vendedor, totalVendido);
        vendedor.exibirHolerite();

}