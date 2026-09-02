public abstract class Veiculo {
    private String placa;
    private String modelo;
    private double custoPorKm;
    private StatusVeiculo status;

    public Veiculo(String placa, String modelo, double custoPorKm) {
        if (custoPorKm <= 0) {
            System.out.println("O custo por quilometro deve ser maior que zero!");
            this.custoPorKm = 0.1;
        } else {
            this.custoPorKm = custoPorKm;
        }
        this.placa = placa;
        this.modelo = modelo;
        this.status = StatusVeiculo.DISPONIVEL;
    }

    public void enviarParaManutencao() {
        this.status = StatusVeiculo.EM_MANUTENCAO;
        IO.println("Veiculo " + modelo + " enviado para manutencao.");
    }

    public void liberarDaManutencao() {
        this.status = StatusVeiculo.DISPONIVEL;
        IO.println("Veiculo " + modelo + " liberado e disponivel.");
    }

    public boolean iniciarEntrega(double distancia) {
        if (distancia <= 0) {
            IO.println("A distancia deve ser maior que zero.");
            return false;
        }
        if (this.status == StatusVeiculo.EM_MANUTENCAO) {
            IO.println("O veiculo " + modelo + " esta em manutenção e nao pode ser selecionado.");
            return false;
        }
        if (this.status == StatusVeiculo.EM_ENTREGA) {
            IO.println("O veiculo " + modelo + " ja esta ocupado em outra entrega.");
            return false;
        }
        this.status = StatusVeiculo.EM_ENTREGA;
        return true;
    }

    public abstract double calcularCustoViagem(double distancia);

    public String getPlaca() {
        return placa;
    }
    public String getModelo() {
        return modelo;
    }
    public double getCustoPorKm() {
        return custoPorKm;
    }
    public StatusVeiculo getStatus() {
        return status;
    }
}
