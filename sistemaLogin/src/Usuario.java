import java.time.LocalDate;

public class Usuario {
    //atributos
    public String nome;
    public String senha;
    public LocalDate dtNasc;
    public String email;

    //metodo construtor

    public Usuario(String nome, String senha, LocalDate dtNasc, String email){
        this.nome = nome;
        this.senha = senha;
        this.dtNasc = dtNasc;
        this.email=email;
    }

    public Usuario(String nome, String senha, String email){
        this.nome = nome;
        this.senha = senha;
        this.email=email;
    }

    //metodos
    public String login(){
        return "Logado com sucesso";
    }
    public String logout(){
        return "Deslogado com sucesso";
    }

    public String recuSenha() {
        return "Senha recuperada meu sinhô";
    }

    @Override
    public String toString() {
        return "Usuario:" +
                "\n nome='" + nome + '\'' +
                ",\n senha='" + senha + '\'' +
                ",\n dtNasc=" + dtNasc +
                ",\n email='" + email + '\'';
    }
}
