import static java.lang.IO.*;

void main() {

    Bichinho bichinho = new Bichinho("Douglas", 20, 80);

    println(bichinho);

    bichinho.setFome(1);
    bichinho.setEnergia(40);

    println(bichinho);
}