// package br.com.ecommerce.funcionarios; -- caso aplicação com muitas pastas
import  static java.lang.IO.*;
public abstract class Funcionario {

    //Atributos
    private String nome;
    private String cpf;
    private float salario;

    //Construtor
    public Funcionario(String nome, String cpf, float salario) {
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("O nome do funcionario nao pode ser vazio!");
        }
//        if(cpf == null || cpf.isEmpty()){
//            throw new IllegalArgumentException("O Cpf do funcionario nao pode ser vazio");
//        }
//        if(salario <=0){
//            throw new IllegalArgumentException("O salario nao pode ser igual ou menor que 0");
//        }
//
//        if (cpf.length() == 11) {
//
//            int soma1 = 0;
//            int tamanho1 = 10;
//            //digito 1
//            for (int i = 0; i < 9; i++) {
//                soma1 += (cpf.charAt(i) - '0') * tamanho1;
//                tamanho1--;
//            }
//            int d1 = (soma1 * 10 % 11) % 10;
//
//            int soma2 = 0;
//            int tamanho2 = 11;
//            //digito 2
//            for (int i = 0; i < 10; i++) {
//                soma2 += (cpf.charAt(i) - '0') * tamanho2;
//                tamanho2--;
//            }
//            int d2 = (soma2 * 10 % 11) % 10;
//
//            //ver se digitos batem com o cpf
//            if (d1 == (cpf.charAt(9) - '0') && d2 == (cpf.charAt(10) - '0')) {
//                println("CPF válido!");
//            } else {
//                println("CPF inválido!");
//            }
//
//        } else {
//            //se n tiver 11 numeros
//            println("CPF inválido! O CPF tem que ter 11 dígitos.");
//        }

        this.nome = nome.trim();
        this.cpf = cpf.trim();
        this.salario = salario;
    }

    public String getDados(){
        return String.format("Nome: %s CPF: %s Salario: R$ %.2f",nome,cpf,salario);
    }

    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    //Métodos
    public float getSalario() {
        return salario;
    }
//    public void setSalario(float salario){
//        pu
//    }

    public abstract float calcularBonificacao();
    public abstract float calcularRemuneracaoTotal();
    public abstract float calcularComissao();


    //Metodo para exibir o Holerite
    public void exibirHolerite(){

        // VAIDAÇÃO NOME
        if (nome == null || nome.trim().isEmpty()) {
            IO.println("Nome: O nome precisa ser informado!!!");
        } else {
            IO.println("Nome: " + this.nome);
        }

        // VAIDAÇÃO CPF
        if (cpf == null || cpf.trim().isEmpty()) {
            IO.println("CPF: O cpf precisa ser informado!!!");
        } else {
            IO.println("CPF: " + this.cpf);
        }
        IO.println("Cargo: " + toString());

        // VAIDAÇÃO SALÁRIO
        if (salario <=0){
            IO.println("Salário: Salário não pode ser menor ou igual a 0!!!");
        } else {
            IO.println("Salário: " + this.salario);
        }

        // VALIDAÇÃO BONIFICAÇÃO
        if (this.salario * calcularBonificacao() <0 ){
            IO.println("Bonificação: Bonificação não pode ser menor ou igual a 0!!!");
        } else {
            IO.println("Bonificação: " + this.salario * calcularBonificacao());
        }

        // VALIDAÇÃO COMISSÃO
        if (calcularComissao() < 0){
            IO.println("Comissão: Comissão não pode ser menor ou igual a 0!!!");
        } else {
            IO.println("Comissão: " + calcularComissao());
        }

        // VALIDAÇÃO REMUNERAÇÃO TOTAL
        if (calcularRemuneracaoTotal() <=0){
            IO.println("Remuneração Total: -ERRO-" );
        } else {
            IO.println("Remuneração Total: " + calcularRemuneracaoTotal());
        }
    }
}