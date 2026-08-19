public class ContaBancaria {
    private String titular;
    private float saldo;
    private Float limite; // Valor adicional caso o saldo não seja suficiente

    public ContaBancaria() {
        this.saldo = 0;
    }

    // Getters
    public String getTitular() {
        return titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public Float getLimite() {
        return limite;
    }

    // Setters
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setLimite(Float limite) {
        if (limite > 1000) {
            IO.println("Nao pode ter mais de 1000 de limite, eu avisei ");
        } else {
                this.limite = limite;
        }

    }

    public float depositar(float valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
        return saldo;
    }


    public boolean sacar(float valor) {
        float valorLimite = (limite != null) ? limite : 0f;
        if (valor > 0 && (this.saldo + valorLimite) >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
}
