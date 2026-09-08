import java.lang.IO;

void main() {
    IO.println("=== 4 & 5. DEMONSTRAÇÃO E TESTES OBRIGATÓRIOS ===\n");

    // três veiculos
    Motocicleta moto = new Motocicleta("MTO1A23", "Honda CG 160", 1.5);
    Carro carro = new Carro("CAR2B45", "Fiat Fiorino", 3.0);
    Caminhao caminhao = new Caminhao("ABC1D23", "Volvo FH", 6.5, 12000.0);

    // custo por km invalido
    IO.println("--- Custo por km invalido ---");
    Carro carroInvalido = new Carro("INV0000", "Carro Teste", -2.0);
    IO.println("");

    // diferentes distâncias com 3 veiculos
    IO.println("--- 100 km ---");
    IO.println("Custo Motocicleta: R$ " + moto.calcularCustoViagem(100.0));
    IO.println("Custo Carro: R$ " + carro.calcularCustoViagem(100.0));
    caminhao.carregar(10000.0);
    IO.println("Custo Caminhão (com 10.000 kg): R$ " + caminhao.calcularCustoViagem(100.0));
    IO.println("");

    // distancia negativa
    IO.println("--- Distancia -50 ---");
    IO.println("Tentando iniciar entrega com distância zero/negativa (-50 km):");
    moto.iniciarEntrega(-50.0);
    IO.println("");

    // peso dentro do limite e peso acima do limite
    IO.println("--- Capacidade do caminhão ---");
    IO.println(" Carga dentro do limite (10.000 kg):");
    caminhao.carregar(10000.0);
    IO.println(" Carga acima do limite (15.000 kg):");
    caminhao.carregar(15000.0);
    IO.println("");

    // 5. veiculo na manutenção
    IO.println("--- Manutenção e disponibilidade ---");
    Carro carroManutencao = new Carro("DEF4G56", "Renault Kangoo", 2.5);
    carroManutencao.enviarParaManutencao();

    // iniciar entrega com veiculo em manutenção
    IO.println("Iniciando entrega com o veículo em manutenção:");
    carroManutencao.iniciarEntrega(150.0);

    // Liberar veiculo
    IO.println("");
    carroManutencao.liberarDaManutencao();

    //
    // iniciar a entrega com veiculo disponivel
    IO.println(" Iniciando entrega após liberação:");
    carroManutencao.iniciarEntrega(150.0);
    IO.println("");


    // resultado esperado
    IO.println("=======================================");
    IO.println("===       RESULTADO ESPERADO        ===");
    IO.println("=======================================");

    Caminhao volvo = new Caminhao("ABC1D23", "Volvo FH", 6.5, 12000.0);
    double distVolvo = 350.0;
    double pesoVolvo = 10000.0;

    volvo.carregar(pesoVolvo);
    double custoVolvo = volvo.calcularCustoViagem(distVolvo);

    IO.println("Veículo: " + volvo.getPlaca());
    IO.println("Modelo: " + volvo.getModelo());
    IO.println("Distância: " + (int)distVolvo + " km");
    IO.println("Peso da carga: " + (int)pesoVolvo + " kg");
    IO.println(String.format("Custo previsto: R$ %.2f", custoVolvo));

    if (volvo.iniciarEntrega(distVolvo)) {
        IO.println("Entrega iniciada com sucesso.");
    }

    IO.println("---------------------------------------");

    Carro carroDef = new Carro("DEF4G56", "Renault Kangoo", 2.5);
    carroDef.enviarParaManutencao();

    IO.println("Veículo: " + carroDef.getPlaca());
    IO.println("Situação: " + carroDef.getStatus());

    boolean iniciou = carroDef.iniciarEntrega(100.0);
    if (!iniciou) {
        IO.println("A entrega não pode ser iniciada.");
    }
}