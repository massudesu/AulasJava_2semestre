//Abaixo de 18,5: Abaixo do peso.
//Entre 18,5 e 24,9: Peso normal (saudável).
//Entre 25,0 e 29,9: Sobrepeso (acima do peso).
//30,0 ou mais: obesidade

import java.math.*;
import static java.lang.IO.*;
void main() {
    float peso = Float.parseFloat(IO.readln("Digite seu peso (kg): "));
    float altura = Float.parseFloat(IO.readln("Digite sua altura (cm): "));

    float imc = peso / (altura*altura);

    if(imc < 18.5){
        println("Seu IMC é: "+imc);
        println("Abaixo do peso");
    } else if (imc <=24.9) {
        println("Seu IMC é: "+imc);
        println("Peso normal (saudável)");
    }else if(imc <=29.9){
        println("Seu IMC é: "+imc);
        println("Sobrepeso (acima do peso)");
    }else{
        println("Seu IMC é: "+imc);
        println("Obesidade");
    }



}