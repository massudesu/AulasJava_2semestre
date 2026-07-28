import static java.lang.IO.*;
void main() {
    int par = Integer.parseInt(IO.readln("Digite o numero para saber se é par ou não: "));
    if(par % 2==0){
        print(par + " É par!");
    }else {
        println(par + " Não é par");
        println(par + " É impar");
    }

}