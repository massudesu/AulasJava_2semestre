import java.time.LocalDate;

public class Livro {
    //atributos
    public String nome;
    public String autor;
    public String editora;
    public Float preco;
    public String capa;

    //metodo construtor


    public Livro(String nome, String autor, String editora, Float preco, String capa) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.preco = preco;
        this.capa = capa;
    }
    public String abrir(){
        return "Aberto";
    }
    public String fechar(){
        return "Fechado";
    }
    public String lerPagina(){
        return "Voce leu a pagina";
    }

    @Override
    public String toString() {
        return "Livro:" +
                "\n nome='" + nome + '\'' +
                ",\n autor='" + autor + '\'' +
                ",\n editora='" + editora + '\'' +
                ",\n preco=" + preco +
                ",\n capa='" + capa + '\'';
    }
}
