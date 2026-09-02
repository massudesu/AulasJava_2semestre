public class Motocicleta extends Veiculo {
    public Motocicleta(String placa, String modelo, double custoPorKm) {
        super(placa, modelo, custoPorKm);
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        return distancia * getCustoPorKm();
    }
}
