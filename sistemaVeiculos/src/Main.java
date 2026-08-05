import static java.lang.IO.*;


void main() {
    Carro carro = new Carro("Lancer evoX", "Mitsubishi","Branco", "4", 295);
    Carro carro2 = new Carro("Lancer evoX", "Mitsubishi", 295);
    println(carro);
    println("2: ");
    println(carro2);

    println("=================================================");

    Moto moto = new Moto("Factor 150", "Yamaha", 150, "branca");
    Moto moto2 = new Moto("Factor 150", "Yamaha", 150);
    println(moto);
    println("2: ");
    println(moto2);

    println("=================================================");

    Caminhao caminhao = new Caminhao("FMX", "Volvo", 4, 380);
    Caminhao caminhao2 = new Caminhao("Volvo", 4, 380);

    println(caminhao);
    println("2: ");
    println(caminhao2);

    println("=================================================");

    Bicicleta bicicleta = new Bicicleta(4, "Amarelo", 1, 26);
    Bicicleta bicicleta2 = new Bicicleta(4, 1, 26);

    println(bicicleta);
    println("2: ");
    println(bicicleta2);

}
