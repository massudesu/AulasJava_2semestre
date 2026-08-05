import static java.lang.IO.*;


void main() {
    Carro carro = new Carro("Lancer evoX", "Mitsubishi","Branco", "4", 295);
    //Carro carro = new Carro("Lancer evoX", "Mitsubishi", 295);
    println(carro);

    println("=================================================");

    Moto moto = new Moto("Factor 150", "Yamaha", 150, "branca");
    //Moto moto = new Moto("Factor 150", "Yamaha", 150);
    println(moto);

    println("=================================================");

    Caminhao caminhao = new Caminhao("FMX", "Volvo", 4, 380);
    //Caminhao caminhao = new Caminhao("Volvo", 4, 380);

    println(caminhao);

    println("=================================================");

    Bicicleta bicicleta = new Bicicleta(4, "Amarelo", 1, 26);
    //Bicicleta bicicleta = new Bicicleta(4, 1, 26);

    println(bicicleta);

}
