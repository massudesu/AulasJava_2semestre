public class Caminhao extends Veiculo {
    private double capacidadeMaxima;
    private double pesoCarga;

    public Caminhao(String placa, String modelo, double custoPorKm, double capacidadeMaxima) {
        super(placa, modelo, custoPorKm);
        this.capacidadeMaxima = capacidadeMaxima;
        this.pesoCarga = 0;
    }

    public boolean carregar(double peso) {
        if (peso > capacidadeMaxima) {
            IO.println("Carga de " + peso + "kg excede a capacidade maxima (" + capacidadeMaxima + "kg) do caminhão.");
            return false;
        }
        this.pesoCarga = peso;
        return true;
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        return (distancia * getCustoPorKm()) + (pesoCarga * 0.05);
    }
}
