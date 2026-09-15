public abstract class Funcionario {

    //Atributos
    private String nome;
    private String cpf;
    private float salario;

    //Construtor
    public Funcionario(String nome, String cpf, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    //Métodos
    public float getSalario() {
        return salario;
    }

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