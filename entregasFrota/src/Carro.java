public class Carro extends Veiculo {
    public Carro(String placa, String modelo, double custoPorKm) {
        super(placa, modelo, custoPorKm);
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        return (distancia * getCustoPorKm()) + 20.0;
    }
}
