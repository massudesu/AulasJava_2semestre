public class Cofrinho {

    private String nome;
    private double saldo;
    private double meta;

    public Cofrinho(String nome, double meta) {
        this.nome = nome;
        this.saldo = 0;
        this.meta = meta;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getMeta() {
        return meta;
    }

    public void adicionarDinheiro(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void retirarDinheiro(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }

    public double getProgresso() {
        return (saldo / meta) * 100;
    }

    public String getStatus() {
        if (saldo == 0) {
            return "Meta não iniciada";
        } else if (saldo < meta) {
            return "Economizando";
        } else {
            return "Meta alcançada";
        }
    }
}