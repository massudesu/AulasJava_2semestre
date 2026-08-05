public class Moto {
    //atributos
    public String modelo;
    public String marca;
    public Integer potencia;
    public String cor;


    //metodos construtores
    public Moto(String modelo, String marca, Integer potencia, String cor) {
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
        this.cor = cor;
    }

    public Moto(String modelo, String marca, Integer potencia) {
        this.modelo = modelo;
        this.marca = marca;
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
        return "Moto:" +
                "\n modelo ='" + modelo + '\'' +
                ",\n marca ='"+ marca + '\''+
                ",\n cor ='" + cor + '\''+
                ",\n potencia ='" + potencia + "cc"+ '\'';

    }
}
