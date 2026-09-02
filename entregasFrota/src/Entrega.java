public class Entrega {
    private String destino;
    private double distancia;
    private double pesoCarga;

    public Entrega(String destino, double distancia, double pesoCarga) {
        this.destino = destino;
        this.distancia = distancia;
        this.pesoCarga = pesoCarga;
    }

    public boolean alocarVeiculo(Veiculo veiculo) {
        IO.println("Tentando selecionar o veiculo [" + veiculo.getModelo() + "] para a entrega ate " + destino + " (" + distancia + " km)...");

        if (veiculo instanceof Caminhao) {
            Caminhao caminhao = (Caminhao) veiculo;
            boolean carregouComSucesso = caminhao.carregar(this.pesoCarga);
            if (!carregouComSucesso) {
                IO.println("O caminhao nao suporta o peso desta entrega.");
                return false;
            }
        } else {
            if (this.pesoCarga > 0) {
                IO.println(veiculo.getModelo() + " nao suporta transporte de cargas pesadas.");
                return false;
            }
        }


        boolean entregaIniciada = veiculo.iniciarEntrega(this.distancia);
        if (entregaIniciada) {
            IO.println(String.format("Custo total estimado do frete: R$ %.2f", veiculo.calcularCustoViagem(this.distancia)));

            return true;
        }

        return false;
    }

    public String getDestino() {
        return destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public double getPesoCarga() {
        return pesoCarga;
    }
}
