
import static java.lang.IO.*;
void main() {
    int primo = Integer.parseInt(IO.readln("Digite o numero para saber se é primo ou não: "));
    if (primo % primo==0 && primo % 1 ==0){
        println(primo + " é primo");

    }
}