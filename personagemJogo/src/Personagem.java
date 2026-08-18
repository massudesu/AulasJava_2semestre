public class Personagem {

    private String nome;
    private Integer vida;
    private Integer energia;
    private Integer nivel;
    private Integer receberDano;
    private Integer descansar;

    public Personagem(String nome, Integer vida, Integer energia) {
        this.nome = nome;
        this.vida = vida;
        this.energia = energia;
    }

    public Integer getVida() {

        if(vida > 0){
            return vida;
        }else {
            IO.println("Voce morreu");
        }
        return vida;
    }
    public Integer getEnergia() {
        return energia;
    }
    public Integer getNivel() {
        this.nivel= 1;
        return nivel;
    }

    public void setReceberDano(Integer dano){
        this.vida -= dano;
    }

    public void setDescansar(String descansar){
        if (descansar.equals("s")){
            this.energia = 100;
        }


    }


}
