public class Pessoas {
    private int id;
    private String nome;
    private int idade;

    public Pessoas(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "\nPessoas: " +
                "id = " + id +
                " nome='" + nome +
                " idade=" + idade;
    }
}
