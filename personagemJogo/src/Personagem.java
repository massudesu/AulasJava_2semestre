public class Personagem {

    private String nome;
    private int vida;
    private int energia;
    private int nivel;

    public Personagem(String nome, int vida, int energia) {
        this.nome = nome;
        this.vida = limitarValor(vida);
        this.energia = limitarValor(energia);
        this.nivel = 1;
    }

    private int limitarValor(int valor) {
        if (valor < 0) {
            return 0;
        }

        if (valor > 100) {
            return 100;
        }

        return valor;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getEnergia() {
        return energia;
    }

    public int getNivel() {
        return nivel;
    }

    public void receberDano(int dano) {

        if (dano < 0) {
            return;
        }

        vida -= dano;

        if (vida < 0) {
            vida = 0;
        }
    }

    public void descansar() {

        energia += 20;

        if (energia > 100) {
            energia = 100;
        }

        System.out.println(nome + " descansou!");
        System.out.println("Energia atual: " + energia);
    }

    public boolean atacar(Monstro monstro) {

        int custoEnergia = 20;
        int dano = 25;

        if (energia < custoEnergia) {
            System.out.println("Energia insuficiente para atacar!");
            return false;
        }

        energia -= custoEnergia;

        System.out.println("\n" + nome + " atacou " + monstro.getNome() + "!");
        monstro.receberDano(dano);

        System.out.println("Dano causado: " + dano);
        System.out.println("Energia restante: " + energia);

        return true;
    }

    public String getStatus() {

        if (vida <= 0) {
            return "Derrotado";
        }

        return "Vivo";
    }
}