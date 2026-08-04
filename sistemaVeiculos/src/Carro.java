public class Carro{

    //atributos
    public String modelo;
    public String marca;
    public String numPortas;
    public String cor;
    public String potencia;

    //metodos construtores


    public Carro(String modelo, String marca, String cor, String numPortas) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.numPortas = numPortas;
    }

    public Carro(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
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
        return "Carro:" +
                "\nmodelo='" + modelo + '\'' +
                ",\n marca='" + marca + '\'' +
                ",\n numPortas='" + numPortas + '\'' +
                ",\n cor='" + cor + '\'' +
                ",\n potencia='" + potencia + '\'';
    }
}
