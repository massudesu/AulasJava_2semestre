public class Carro{

    //atributos
    public String modelo;
    public String marca;
    public String numPortas;
    public String cor;
    public Integer potencia;
    //metodos construtores

    //ATILA
    public Carro(String modelo, String marca, String numPortas) {
        this.modelo = modelo;
        this.marca = marca;
        this.numPortas= numPortas;
    }
    //

    public Carro(String modelo, String marca, String cor, String numPortas, Integer potencia) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.numPortas = numPortas;
        this.potencia= potencia;
    }


    public Carro(String modelo, String marca, Integer potencia) {
        this.modelo = modelo;
        this.marca = marca;
        this.potencia= potencia;
    }

    //metodos
    public String ligar(){
        return "Ligando";
    }

    public String acelerar(){
        return "Acelerando";
    }

    public String frear(){
        return "Freando";
    }

    public String desligar(){
        return "Desligando";
    }

    @Override
    public String toString() {
        return "\nCarro:" +
                "\n modelo ='" + modelo + '\'' +
                ",\n marca ='" + marca + '\'' +
                ",\n numPortas ='" + numPortas + '\'' +
                ",\n cor ='" + cor + '\'' +
                ",\n potencia ='" + potencia + "cv"+ '\'';
    }
}
