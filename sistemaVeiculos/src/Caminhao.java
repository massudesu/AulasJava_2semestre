public class Caminhao {
    //atributos
    public String modelo;
    public String marca;
    public String tamanho;
    public String potencia;

    //metodos construtores


    public Caminhao(String modelo, String marca, String tamanho, String potencia) {
        this.modelo = modelo;
        this.marca = marca;
        this.tamanho = tamanho;
        this.potencia = potencia;
    }

    public Caminhao(String marca, String tamanho) {
        this.marca = marca;
        this.tamanho = tamanho;
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
        return "Caminhao:" +
                "\nmodelo='" + modelo + '\'' +
                ",\n marca='" + marca + '\'' +
                ",\n tamanho='" + tamanho + '\'' +
                ",\n potencia='" + potencia + '\'';
    }
}
