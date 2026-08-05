import javax.print.DocFlavor;

public class Bicicleta {

    //atributos
    public Integer marcha;
    public String cor;
    public Integer assentos;
    public Integer tamAro;
    //metodo  construtor


    public Bicicleta(Integer marcha, String cor, Integer assentos, Integer tamAro) {
        this.marcha = marcha;
        this.cor = cor;
        this.assentos = assentos;
        this.tamAro = tamAro;
    }

    public Bicicleta(Integer marcha,Integer assentos, Integer tamAro) {
        this.marcha = marcha;
        this.assentos = assentos;
        this.tamAro = tamAro;
    }

    //metodos
    public String acelerar(){
        return "Acelerando";
    }

    public String frear(){
        return "freando";
    }

    public String trocarMarcha(){
        return "Trocando a marcha";
    }


    @Override
    public String toString() {
        return "Bicicleta:" +
                "\n marcha ='" + marcha + '\'' +
                ",\n assentos ='" + assentos +'\''+
                ",\n cor ='" + cor + '\'' +
                ",\n tamAro ='" + tamAro + '\'';
    }
}
