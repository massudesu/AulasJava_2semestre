//Os atributos nome, vida, energia e nivel devem ser
// private.
//A vida deve variar entre 0 e 100.
//A energia deve variar entre 0 e 100.
//O nivel deve começar em 1.
//Não deve existir setVida() nem setEnergia() livremente.
//O método receberDano(int dano) deve diminuir a vida.
//O método descansar() deve recuperar energia.
//A energia recuperada não pode ultrapassar 100.
//O método atacar() deve consumir energia.
//Um personagem sem energia suficiente não pode atacar.
//Quando a vida chegar a 0, o personagem deve ser considerado derrotado.
//O método getStatus() deve informar automaticamente se o
// personagem está Vivo ou Derrotado, sem existir um atributo
// status para ser alterado manualmente.


void main() {
    Personagem personagem = new Personagem("nicolas", 100, 8);
    IO.println(personagem);
    IO.println("Você tem: " + personagem.getVida() + " de vida ");
    IO.println("Você tem: " + personagem.getEnergia() + " de energia ");
//    int dano = Integer.parseInt(IO.readln("Dano recebido: "));
//    personagem.setReceberDano(dano);
//    IO.println("Você ficou com: " + personagem.getVida() + " de vida");
    String descansar = IO.readln("Precisa descansar(s/n): ");
    personagem.setDescansar(descansar);
    IO.println("Você descansou e esta com: " + personagem.getEnergia()+ " de energia");
}
