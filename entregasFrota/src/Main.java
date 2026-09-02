import java.util.ArrayList;
import java.util.List;

void main() {
    List<Veiculo> frota = new ArrayList<>();
    frota.add(new Motocicleta("MOT1111", "Honda CG 160", 1.5));
    frota.add(new Carro("CAR2222", "Fiat Fiorino", 3.0));

    Caminhao scania = new Caminhao("CAM3333", "Scania R450", 6.5, 15000);
    frota.add(scania);

    System.out.println("=== CENARIO 1: Tentando selecionar Moto para entrega com carga pesada ===");
    Entrega entregaPesada = new Entrega("Almoxarifado Central", 120.0, 5000.0);

    entregaPesada.alocarVeiculo(frota.get(0));

    System.out.println("=== CENARIO 2: Selecionando o veiculo correto (Caminhao) para a carga ===");

    entregaPesada.alocarVeiculo(scania);

    System.out.println("=== CENARIO 3: Tentando selecionar o mesmo veiculo que ja esta em entrega ===");
    Entrega outraEntrega = new Entrega("Filial Zona Sul", 45.0, 1000.0);

    outraEntrega.alocarVeiculo(scania);

    System.out.println("=== CENARIO 4: Selecionando veiculo leve para documentos (Sem peso) ===");
    Entrega entregaDocumentos = new Entrega("Cartorio Centro", 15.0, 0.0);

    entregaDocumentos.alocarVeiculo(frota.get(0));

    System.out.println("=== CENARIO 5: Tentando selecionar um veiculo que entrou em manutencao ===");
    Veiculo carroFiorino = frota.get(1);
    carroFiorino.enviarParaManutencao();

    Entrega entregaExpressa = new Entrega("Cliente VIP", 80.0, 0.0);

    entregaExpressa.alocarVeiculo(carroFiorino);
}
