public class Monstro {

    private String nome;
    private int vida;
    private int dano;

    public Monstro(String nome, int vida, int dano) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getDano() {
        return dano;
    }

    public void receberDano(int dano) {

        if (dano < 0) {
            return;
        }

        vida -= dano;

        if (vida < 0) {
            vida = 0;
        }

        System.out.println(nome + " recebeu " + dano + " de dano!");
        System.out.println("Vida do monstro: " + vida);
    }

    public void atacar(Personagem personagem) {

        if (vida <= 0) {
            return;
        }

        System.out.println("\n" + nome + " atacou " + personagem.getNome() + "!");

        personagem.receberDano(dano);

        System.out.println("Dano recebido: " + dano);
        System.out.println("Vida restante: " + personagem.getVida());
    }

    public String getStatus() {

        if (vida <= 0) {
            return "Derrotado";
        }

        return "Vivo";
    }
}