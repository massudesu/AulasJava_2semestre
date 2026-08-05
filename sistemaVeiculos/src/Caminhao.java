public class Caminhao {
    //atributos
    public String modelo;
    public String marca;
    public Integer eixos;
    public Integer potencia;

    //metodos construtores


    public Caminhao(String modelo, String marca, Integer eixos, Integer potencia) {
        this.modelo = modelo;
        this.marca = marca;
        this.eixos = eixos;
        this.potencia = potencia;
    }

    public Caminhao(String marca, Integer eixos, Integer potencia) {
        this.marca = marca;
        this.eixos = eixos;
        this.potencia = potencia;
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
                "\n modelo ='" + modelo + '\'' +
                ",\n marca ='" + marca + '\'' +
                ",\n eixos ='" + eixos + '\'' +
                ",\n potencia ='" + potencia + "cv"+ '\'';
    }
}
