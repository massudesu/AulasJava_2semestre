import static java.lang.IO.*;
void main() {
    double valor = Double.parseDouble(IO.readln("Digite o valor em Real (R$): "));

    double dolar = valor / 5.13;
    double euro = valor / 5.85;

    println("O valor em Dolar é: "+String.format("%.2f", dolar));
    println("O valor em Euro é: "+String.format("%.2f",euro));



}
