import static java.lang.IO.*;

void main() {

    println("===== BATALHA =====");

    String nome = readln("Digite o nome do seu personagem: ");
    Personagem personagem = new Personagem(nome, 100, 100);
    Monstro monstro = new Monstro("Goblin", 100, 15);

    println("Um " + monstro.getNome() + " apareceu!");
    println("Vida do monstro: " + monstro.getVida());

    int opcao;

    do {

        println("==============================");
        println("          MENU");
        println("==============================");
        println("1 - Ver status");
        println("2 - Atacar");
        println("3 - Descansar");
        println("4 - Sair");
        println("==============================");
        String entrada = readln("Escolha uma opção: ");

        try {
            opcao = Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            opcao = 0;
        }

        switch (opcao) {

            case 1:

                println("===== SEU PERSONAGEM =====");
                println("Nome: " + personagem.getNome());
                println("Vida: " + personagem.getVida());
                println("Energia: " + personagem.getEnergia());
                println("Nível: " + personagem.getNivel());
                println("Status: " + personagem.getStatus());

                println("===== MONSTRO =====");
                println("Nome: " + monstro.getNome());
                println("Vida: " + monstro.getVida());
                println("Dano: " + monstro.getDano());
                println("Status: " + monstro.getStatus());

                break;

            case 2:

                if (personagem.getStatus().equals("Derrotado")) {
                    println("Você está derrotado!");
                    break;
                }

                if (monstro.getStatus().equals("Derrotado")) {
                    println("O monstro já foi derrotado!");
                    break;
                }


                boolean atacou = personagem.atacar(monstro);


                if (atacou && monstro.getStatus().equals("Vivo")) {

                    monstro.atacar(personagem);

                }


                if (monstro.getStatus().equals("Derrotado")) {

                    println("==============================");
                    println("       VOCÊ VENCEU!");
                    println("==============================");

                } else if (personagem.getStatus().equals("Derrotado")) {

                    println("==============================");
                    println("       VOCÊ PERDEU!");
                    println("==============================");
                }

                break;

            case 3:

                if (personagem.getStatus().equals("Derrotado")) {

                    println("Você está derrotado e não pode descansar!");

                } else if (monstro.getStatus().equals("Derrotado")) {

                    println("O monstro já foi derrotado!");

                } else {

                    personagem.descansar();


                    println("Cuidado! O monstro aproveitou!");
                    monstro.atacar(personagem);
                }

                break;

            case 4:

                println("Saindo da batalha...");

                break;

            default:

                println("Opção inválida!");
        }
    } while (opcao != 4);
}
